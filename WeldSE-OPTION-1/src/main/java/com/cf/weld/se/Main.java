package com.cf.weld.se;

import java.io.IOException;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(final String[] args) throws IOException {
        final Weld weld = new Weld();
        final WeldContainer container = weld.initialize();
        final Application application = container.instance().select(Application.class).get();
        application.run();
        weld.shutdown();
    }
}
