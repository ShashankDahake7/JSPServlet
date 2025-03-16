package com.codingninjas;

import jakarta.xml.ws.Endpoint;

public class HeyNinjasPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/hey", new HeyNinjasImpl());
        System.out.println("HeyNinjas Web Service published at http://localhost:7779/ws/hey?wsdl");
    }
}
