package com.paxage.someconnectors;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VerifyFooAndHadoop {
    @Test
    public void yepItWorks() {
        ConnectFooAndHadoop cfah = new ConnectFooAndHadoop();
        assertEquals(42, cfah.getF().getAnswer());
    }

    @Test
    public void yepItWorks2() {
        ConnectFooAndHadoop cfah = new ConnectFooAndHadoop();
        assertEquals(99, cfah.getConf().getInt("not.here", 99));
    }
}