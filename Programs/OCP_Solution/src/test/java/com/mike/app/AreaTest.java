package com.mike.app;

import Config.AppConfig;
import Domain.AreaCalculator;
import Services.Impl.Circle;
import Services.Impl.Rectangle;
import Services.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/27.
 */
public class AreaTest {
    ApplicationContext ctx;
    List<Shape> shapeList;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        shapeList = new ArrayList<Shape>();
    }

    @Test
    public void testArea() throws Exception {
        AreaCalculator calcArea = new AreaCalculator();
        Circle circle = (Circle)ctx.getBean("Circle");
        Rectangle rectangle = (Rectangle)ctx.getBean("Rectangle");
        circle.setRadius(5);
        rectangle.setHeight(5);
        rectangle.setWidth(5);
        shapeList.add(circle);
        shapeList.add(rectangle);
        Assert.assertEquals(103.5,calcArea.area(shapeList),0.007);
    }
}
