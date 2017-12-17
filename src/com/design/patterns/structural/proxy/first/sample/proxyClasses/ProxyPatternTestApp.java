package com.design.patterns.structural.proxy.first.sample.proxyClasses;

public class ProxyPatternTestApp {
    public static void main(String[] args) {
        System.out.println("****Proxy Pattern Demo****");

        Proxy px = new Proxy();
        px.doSomeWork();
    }
}
