package com.fujitsu.serverview.ui.model;

import org.springframework.stereotype.Component;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Component
public class Bean {
    String name;

    public Bean() {
    }

    public Bean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
