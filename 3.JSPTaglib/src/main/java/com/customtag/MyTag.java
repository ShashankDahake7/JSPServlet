package com.customtag;

import java.io.IOException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;

public class MyTag extends SimpleTagSupport {
    private String message;

    public void setMessage(String msg) {
        this.message = msg;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.print(message != null ? message : "Default Message");
    }
}
