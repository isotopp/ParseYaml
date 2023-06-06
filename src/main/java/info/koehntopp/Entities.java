package info.koehntopp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Entities {
    @JsonProperty("Entity")
    private ArrayList<Entity> entityList;

    public Entities() {
        this.entityList = new ArrayList<Entity>();
    }

    public ArrayList<Entity> getEntityList() {
        return entityList;
    }

    public Entities append(Entity e) {
        this.entityList.add(e);

        return this;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "entityList=" + entityList +
                '}';
    }
}
