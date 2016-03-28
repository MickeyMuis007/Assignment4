package com.mike.app;

import Config.AppConfig;
import Domain.BirdShow;
import Services.Impl.Crow;
import Services.Impl.Ostrich;
import Services.Impl.Owl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class BirdTest {
    ApplicationContext ctx;
    Crow crow;
    Ostrich ostrich;
    Owl owl;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        crow = (Crow)ctx.getBean("Crow");
        ostrich = (Ostrich)ctx.getBean("Ostrich");
        owl = (Owl)ctx.getBean("Owl");
    }

    @Test
    public void testCrowFly() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow flying", show.birdFlying(crow));
    }

    @Test
    public void testCrowWalk() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow walking", show.birdWalking(crow));
    }

    @Test
    public void testCrowEat() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Crow eating", show.birdEating(crow));
    }

    @Test
    public void testOwlFly() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Owl flying", show.birdFlying(owl));
    }

    @Test
    public void testOwlWalk() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Owl walking", show.birdWalking(owl));
    }

    @Test
    public void testOwlEat() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Owl eating", show.birdEating(owl));
    }

    @Test
    public void testOstrichWalk() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Ostrich walking", show.birdWalking(ostrich));
    }

    @Test
    public void testOstrichEat() throws Exception {
        BirdShow show = new BirdShow();
        Assert.assertEquals("Ostrich eating", show.birdEating(ostrich));
    }
}
