package com.dbolshak.gitflow.poc;

import org.junit.Assert;
import org.junit.Test;
import com.dbolshak.gitflow.poc.MessageBuilder;

/**
 * Created by dbolshak on 30/01/2017.
 */
public class MessageBuilderTest {
    private static final String TEST_MESSAGE = "test";

    @Test
    public void buildMessage() {
        Message message = MessageBuilder.build(TEST_MESSAGE);
       Assert.assertEquals("[MDT-145]"+ TEST_MESSAGE, message.getMessage());
    }
}
