package info.koehntopp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector3 {
    @JsonProperty
    int[] xyz;

    public Vector3() {
        this.xyz = new int[]{0, 0, 0};
    }

    public Vector3(int[] a) {
        System.arraycopy(a, 0, this.xyz, 0, 3);

    }

    public Vector3(int x, int y, int z) {
        this.xyz = new int[]{ x, y, z } ;
    }

    public int[] getXyz() {
        return xyz;
    }

    @Override
    public String toString() {
        return "Vector3{" + "xyz=" + Arrays.toString(xyz) + '}';
    }
}