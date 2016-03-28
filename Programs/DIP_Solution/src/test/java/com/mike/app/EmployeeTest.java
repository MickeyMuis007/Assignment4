package com.mike.app;

import Config.AppConfig;
import Domain.Manager;
import Services.AWorker;
import Services.Impl.SuperWorker;
import Services.Impl.Worker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class EmployeeTest {
    SuperWorker superWorker;
    Worker worker;
    Manager manager;
    ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        superWorker = (SuperWorker)ctx.getBean("SuperWorker");
        worker = (Worker)ctx.getBean("Worker");
        manager = new Manager();
    }

    @Test
    public void testWorker() throws Exception {
        Assert.assertEquals("Worker working",worker.work());
    }

    @Test
    public void testSuperWorker() throws Exception {
        Assert.assertEquals("SuperWorker working", superWorker.work());
    }

    @Test
    public void testManageSuperWorker() throws Exception {
        manager.setWorker(superWorker);
        Assert.assertEquals("Manager manage SuperWorker working", manager.manage());
    }

    @Test
    public void testManageWorker() throws Exception {
        manager.setWorker(worker);
        Assert.assertEquals("Manager manage Worker working",manager.manage());
    }
}
