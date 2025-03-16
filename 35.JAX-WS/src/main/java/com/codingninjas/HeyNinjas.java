package com.codingninjas;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HeyNinjas {
    @WebMethod
    String getHeyNinjasAsString(String name);
}
