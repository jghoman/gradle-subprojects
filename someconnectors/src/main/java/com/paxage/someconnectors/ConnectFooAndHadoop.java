package com.paxage.someconnectors;

import com.paxage.*;

import org.apache.hadoop.conf.Configuration;

public class ConnectFooAndHadoop {
    Foo f;
    Configuration conf;

    public Foo getF() {
        return f;
    }

    public Configuration getConf() {
        return conf;
    }

    public ConnectFooAndHadoop() {
        f = new Foo();
        conf = new Configuration();

    }
}