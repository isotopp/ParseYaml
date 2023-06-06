package info.koehntopp;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static Entities sampleData() {
        return new Entities()
                .append(new Friend("Keks", false, 1000, new Vector3(0, 0, 0)))
                .append(new Enemy("Grimbart", true, 1200));
    }

    public static void writeEntities(String filename, Entities entities) throws java.io.IOException {
        YAMLFactory yamlfactory = new YAMLFactory();
        ObjectMapper mapper = new ObjectMapper(yamlfactory);
        File theFile = new File(filename);

        mapper.writeValue(theFile, entities);
    }

    public static Entities readEntities(String filename) throws IOException {
        YAMLFactory yamlFactory = new YAMLFactory();
        ObjectMapper mapper = new ObjectMapper(yamlFactory);

        Entities entities;
        entities = mapper.readValue(new File(filename), Entities.class);

        return entities;
    }

    public static void main(String[] args) throws java.io.IOException {
        Entities entitiesToWrite = sampleData();
        System.out.println(entitiesToWrite);

        writeEntities("output.yaml", entitiesToWrite);

        Entities entitiesFromFile = readEntities("output.yaml");
        System.out.println(entitiesFromFile);
    }

}