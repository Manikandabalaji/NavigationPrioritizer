package com.hakuna.matata.navigationprioritizer.util;

public class TrafficMgmt {
    private LightType type;

    public LightType[] getTypes() {
        return LightType.values();
    }

    public LightType getType() {
        return type;
    }

    private enum LightType {
        GREEN,
        RED,
        WHITE
    }

}
