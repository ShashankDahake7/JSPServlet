package com.codingninjas;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.codingninjas.HeyNinjas")
public class HeyNinjasImpl implements HeyNinjas {
    @Override
    public String getHeyNinjasAsString(String name) {
        return "Hey Ninjas JAX-WS " + name;
    }
}
