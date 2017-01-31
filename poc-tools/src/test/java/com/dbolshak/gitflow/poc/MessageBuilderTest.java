package com.dbolshak.gitflow.poc;

import org.junit.Test;

import static com.dbolshak.gitflow.poc.MessageBuilder.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class MessageBuilderTest {
    private static final String TEST_MESSAGE = "test";

    @Test
    public void buildMessage() {
       assertEquals(Message.MESSAGE_TAG + TEST_MESSAGE,
               build(TEST_MESSAGE).getMessage());
    }
}
