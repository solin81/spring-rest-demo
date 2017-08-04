package com.fujitsu.serverview.ui.model;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
public class SimpleMessage {

    private String message;
    private String format;

    public SimpleMessage() {
    }

    public SimpleMessage(String message, String format) {
        this.message = message;
        this.format = format;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
