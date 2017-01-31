package com.dbolshak.gitflow.poc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class ServerTest {

    @Test
    public void sendMessage() {
        assertTrue(new Server().sendMessage("Hello gitflow\n"));
    }
}
