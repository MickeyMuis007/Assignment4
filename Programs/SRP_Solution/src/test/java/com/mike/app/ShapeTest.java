package com.mike.app;

import Config.AppConfig;
import Domain.DrawingShape;
import Services.Color;
import Services.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.rmi.MarshalledObject;

/**
 * Created by student on 2016/03/26.
 */
public class ShapeTest {
    Shape shape1;
    Shape shape2;
    Color shapeColor;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        shape1 = (Shape)ctx.getBean("Triangle");
        shape2 = (Shape)ctx.getBean("Square");
        shapeColor = (Color)ctx.getBean("ShapeColor");
    }

    @Test
    public void testTriangle() throws Exception {
        DrawingShape shape = shape1.draw();
        shapeColor.setShapeColor(shape,"Pink");
        Assert.assertEquals("TrianglePink",shape.getType()+shape.getColor());
    }

    @Test
    public void testSquare() throws Exception {
        DrawingShape shape = shape2.draw();
        shapeColor.setShapeColor(shape,"Red");
        Assert.assertEquals("SquareRed",shape.getType()+shape.getColor());
    }
}
