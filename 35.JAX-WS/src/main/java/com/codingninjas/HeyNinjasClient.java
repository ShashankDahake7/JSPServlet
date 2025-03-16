package com.codingninjas;

import java.net.URL;
import jakarta.xml.namespace.QName;
import jakarta.xml.ws.Service;

public class HeyNinjasClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7779/ws/hey?wsdl");

        QName qname = new QName("http://codingninjas.com/", "HeyNinjasImplService");
        Service service = Service.create(url, qname);
        HeyNinjas hello = service.getPort(HeyNinjas.class);

        System.out.println(hello.getHeyNinjasAsString("Jakarta EE"));
    }
}