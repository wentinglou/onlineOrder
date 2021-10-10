package com.wentinglou.onlineOrder;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.json.JSONObject;
import org.apache.commons.io.IOUtils;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        response.getWriter();

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject json = new JSONObject(IOUtils.toString(request.getReader()));

        response.getWriter();
    }
    public void destroy() {
    }
}