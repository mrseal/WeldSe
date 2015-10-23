package com.cf.weld.se;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

/**
 * Hello world!
 *
 */
public class App {

    @Inject
    private InjectedClass injected;

    public void main(@Observes final ContainerInitialized event) {
        System.out.println("Hello!");
        injected.hello();
    }

}
