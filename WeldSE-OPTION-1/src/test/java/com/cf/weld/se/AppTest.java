package com.cf.weld.se;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class AppTest {

    @Inject
    private SampleBean bean;

    @Deployment
    public static JavaArchive createTestArchive() {
        final JavaArchive jar = ShrinkWrap.create(JavaArchive.class, "AppTest.jar");
        jar.addClass(SampleBean.class);
        jar.addAsResource("META-INF/beans.xml");
        jar.setManifest("META-INF/MANIFEST.MF");
        return jar;
    }

    @Test
    public void test() {
        assertEquals("SampleBean", bean.getName());
    }

}
