package com.dbolshak.gitflow.poc;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class Server {
    public boolean sendMessage(String message) {
        System.out.printf("Sending message %s",
                MessageBuilder.build(message).getMessage());

        return true;
    }
}
