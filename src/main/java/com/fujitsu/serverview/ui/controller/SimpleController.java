package com.fujitsu.serverview.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping(value = "/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> welcomeMessage() {
        return new ResponseEntity<>("Hello world from controller!!!", HttpStatus.OK);
    }

    @GetMapping(value = "/welcome", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String welcomeMessageJson() {
        return "Hello world from controller json!!!";
    }

    @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_XML_VALUE)
    public String welcomeMessageXml() {
        return "Hello world from controller xml!!!";
    }


}
