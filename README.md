# ParseYaml

## Build and Run

```
$ mvn clean package
...
$ find . -iname '*.jar'
./target/original-ParseYaml-1.0-SNAPSHOT.jar
./target/ParseYaml-1.0-SNAPSHOT.jar
$ java -version
openjdk version "20.0.1" 2023-04-18
OpenJDK Runtime Environment Homebrew (build 20.0.1)
OpenJDK 64-Bit Server VM Homebrew (build 20.0.1, mixed mode, sharing)
$ java -jar ./target/ParseYaml-1.0-SNAPSHOT.jar
Entities{entityList=[Friend{name='Keks', killable=false, gold=1000, bed=Vector3{xyz=[0, 0, 0]}}, Enemy{name='Grimbart', killable=true, hitpoints=1200}]}
Entities{entityList=[Friend{name='Keks', killable=false, gold=1000, bed=Vector3{xyz=[0, 0, 0]}}, Enemy{name='Grimbart', killable=true, hitpoints=1200}]}
$ cat output.yaml
---
Entity:
- name: "Keks"
  killable: false
  gold: 1000
  bed:
    xyz:
    - 0
    - 0
    - 0
- name: "Grimbart"
  killable: true
  hitpoints: 1200
```
