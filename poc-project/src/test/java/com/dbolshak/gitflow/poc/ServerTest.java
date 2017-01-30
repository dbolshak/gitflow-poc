package com.dbolshak.gitflow.poc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class ServerTest {

    @Test
    public void sendMessage() {
        Assert.assertTrue(new Server().sendMessage("Hello gitflow"));
    }
}
