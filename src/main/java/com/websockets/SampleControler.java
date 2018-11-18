package com.websockets;

import jdk.jfr.ContentType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControler {

    @RequestMapping(path = "/hallo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hallo() {
        return "Hallo";
    }
}
