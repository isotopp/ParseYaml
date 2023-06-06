package info.koehntopp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Enemy extends Entity {
    @JsonProperty
    protected String name;
    @JsonProperty
    boolean killable;

    @JsonProperty
    int hitpoints;

    public Enemy() {
    }

    public Enemy(String name, boolean killable, int hitpoints) {
        this.name = name;
        this.killable = killable;
        this.hitpoints = hitpoints;
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

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", killable=" + killable +
                ", hitpoints=" + hitpoints +
                '}';
    }
}
