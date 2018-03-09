package com.fujitsu.serverview.ui.controller;

import com.fujitsu.serverview.ui.model.Bean;
import com.fujitsu.serverview.ui.model.SimpleMessage;
import com.fujitsu.serverview.ui.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SimpleService service;

    @Autowired
    private Bean myBean;

    @GetMapping(value = "/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<SimpleMessage> welcomeMessage() {
        return new ResponseEntity<>(service.getSimpleMessageText(), HttpStatus.OK);
    }

    @GetMapping(value = "/welcome", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SimpleMessage> welcomeMessageJson() {
        return new ResponseEntity<>(service.getSimpleMessageJson(), HttpStatus.OK);
    }

    @GetMapping(value = "/welcome", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<SimpleMessage> welcomeMessageXml() {
        return new ResponseEntity<>(service.getSimpleMessageXml(), HttpStatus.OK);
    }


}
