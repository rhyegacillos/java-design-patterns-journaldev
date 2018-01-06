package com.design.patterns.structural.proxy.another.sample.proxyClasses;

import com.design.patterns.structural.proxy.another.sample.originalClasses.ConcreteSubject;
import com.design.patterns.structural.proxy.another.sample.originalClasses.Subject;

public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        // Lazy initialization
        if(cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
