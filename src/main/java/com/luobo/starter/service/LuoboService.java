package com.luobo.starter.service;

import com.luobo.starter.properties.LuoboProperties;

public class LuoboService {

    private LuoboProperties luoboProperties;

    public LuoboProperties getLuoboProperties() {
        return luoboProperties;
    }

    public void setLuoboProperties(LuoboProperties luoboProperties) {
        this.luoboProperties = luoboProperties;
    }

    public String sayHello(String name) {
        return luoboProperties.getPrefix()+ "-" + name + luoboProperties.getSuffix();
    }
}
