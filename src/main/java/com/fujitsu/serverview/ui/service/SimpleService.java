package com.fujitsu.serverview.ui.service;

import com.fujitsu.serverview.ui.model.SimpleMessage;
import org.springframework.stereotype.Component;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Component
public class SimpleService {

    public SimpleMessage getSimpleMessageText() {
        return new SimpleMessage("Hello world TEXT!", "txt");
    }

    public SimpleMessage getSimpleMessageJson() {
        return new SimpleMessage("Hello world JSON!", "json");
    }

    public SimpleMessage getSimpleMessageXml() {
        return new SimpleMessage("Hello world XML!", "xml");
    }

}
