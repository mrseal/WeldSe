package com.cf.weld.se;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application {

    @Inject
    private InjectedClass bean;

    public void run() {
        bean.hello();
    }

}
