package com.paxage;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestFoo {

    @Test
    public void verifyFoo() {
        Foo f = new Foo();
        assertEquals(f.getAnswer(), 42);
    }
}

