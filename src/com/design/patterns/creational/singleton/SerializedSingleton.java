package com.design.patterns.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serilaVersinUID = -4634534;

    private SerializedSingleton() {}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
