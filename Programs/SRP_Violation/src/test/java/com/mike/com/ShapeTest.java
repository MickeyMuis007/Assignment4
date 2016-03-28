package com.mike.com;

import Config.AppConfig;
import Domain.DrawingShapes;
import Services.Shape;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/26.
 */
public class ShapeTest {
    private Shape shape1;
    private Shape shape2;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        shape1 = (Shape) ctx.getBean("Triangle");
        shape2 = (Shape) ctx.getBean("Square");
    }

    @Test
    public void testTriangle() throws Exception {
        DrawingShapes s1= shape2.draw();
        shape2.setColor(s1, "Red");
        Assert.assertEquals("TriangleRed", s1.getType()+s1.getColor());
    }

    @Test
    public void testSquare() throws Exception {
        DrawingShapes s1 = shape2.draw();
        shape2.setColor(s1,"Blue");
        Assert.assertEquals("SquareBlue", s1.getType()+s1.getColor());
    }
}
