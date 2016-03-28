package com.mycompany.app;

import Services.AreaCaclculator;
import Services.Circle;
import Services.Rectangle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by student on 2016/03/27.
 */
public class AreaTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testRectangle() throws Exception {
        ArrayList a = new ArrayList();

        a.add(new Rectangle(5,5));
        a.add(new Circle(5));
        AreaCaclculator area = new AreaCaclculator();
        System.out.println(area.area(a));
    }
}
