package com.mike.app;

import Config.AppConfig;
import Domain.BirdShow;
import Services.Impl.Crow;
import Services.Impl.Ostrich;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class BirdTest {
    Ostrich ostrich;
    Crow crow;
    ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        crow = (Crow)ctx.getBean("Crow");
        ostrich = (Ostrich)ctx.getBean("Ostrich");
    }

    @Test
    public void testOstrichFly() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Ostrich don't fly", show.birdFlying(ostrich));
    }

    @Test
    public void testOstrichEat() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Ostrich eating", show.birdEating(ostrich));
    }

    @Test
    public void testOstrichWalk() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Ostrich walking", show.birdWalking(ostrich));
    }

    @Test
    public void testCrowWalking() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow walking", show.birdWalking(crow));
    }

    @Test
    public void testCrowEating() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow eating", show.birdEating(crow));
    }

    @Test
    public void testCrowFlying() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow flying", show.birdFlying(crow));
    }
}
