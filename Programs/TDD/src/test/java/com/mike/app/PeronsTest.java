package com.mike.app;


import Config.AppConfig;
import Domain.Dad;
import Domain.Son;
import Services.Impl.Circle;
import Services.Impl.Triangle;
import Services.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/28.
 */
public class PeronsTest {
    Shape triangle;
    Shape circle;
    Dad dad;
    Son son;
    ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        dad = new Dad("Richard",67,"Bass",4);
        son = new Son("Michael",24,"Tenor","Jazz");
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        triangle = (Triangle)ctx.getBean("Triangle");
        circle = (Circle)ctx.getBean("Circle");
    }

    @Test
    public void testDad() throws Exception {
        Assert.assertEquals("Richard67Bass4",dad.getName()+dad.getAge()+dad.getSing()+dad.getDependence());
    }

    @Test
    public void testSon() throws Exception {
        Assert.assertEquals("Michael24TenorJazz",son.getName()+son.getAge()+son.getSing()+son.getDance());
    }

    @Test
    public void testTriangle() throws Exception {
        Assert.assertEquals("Triangle",triangle.draw());
    }

    @Test
    public void testCircle() throws Exception {
        Assert.assertEquals("Circle",circle.draw());
    }

}
