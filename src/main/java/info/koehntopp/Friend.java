package info.koehntopp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Friend extends Entity {
    @JsonProperty
    protected String name;
    @JsonProperty
    boolean killable;
    @JsonProperty
    int gold;
    @JsonProperty
    Vector3 bed;

    public Friend() {
    }

    public Friend(String name, boolean killable, int gold, Vector3 bed) {
        this.name = name;
        this.killable = killable;
        this.gold = gold;
        this.bed = bed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKillable() {
        return killable;
    }

    public void setKillable(boolean killable) {
        this.killable = killable;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Vector3 getBed() {
        return bed;
    }

    public void setBed(Vector3 bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", killable=" + killable +
                ", gold=" + gold +
                ", bed=" + bed +
                '}';
    }
}



