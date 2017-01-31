package com.dbolshak.gitflow.poc;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class Message {
    public static final String MESSAGE_TAG = "[MDT-145]";

    private final String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return MESSAGE_TAG + message;
    }
}
