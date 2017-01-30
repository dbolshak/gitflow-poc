package com.dbolshak.gitflow.poc;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class MessageBuilder {
    public static Message build(String message) {
        return new Message(message);
    }
}
