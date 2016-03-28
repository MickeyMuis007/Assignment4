package com.mike.app;

import Domain.Manager;
import Services.Impl.Robot;
import Services.Impl.SuperWorker;
import Services.Impl.Worker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/28.
 */
public class WorkerTest {
    Robot robot;
    SuperWorker superWorker;
    Worker worker;
    Manager manager;

    @Before
    public void setUp() throws Exception {
        robot = new Robot("Android");
        superWorker = new SuperWorker("Mike");
        worker = new Worker("Alan");
        manager = new Manager("Hendricks");

    }

    @Test
    public void testManagerRobot() throws Exception {
        manager.setWorker(robot);
        Assert.assertEquals("Hendricks manage Android working",manager.manage());
    }

    @Test
    public void testManagerWorker() throws Exception {
        manager.setWorker(worker);
        Assert.assertEquals("Hendricks manage Alan working", manager.manage());
    }

    @Test
    public void testManageSuperWorker() throws Exception {
        manager.setWorker(superWorker);
        Assert.assertEquals("Hendricks manage Mike working", manager.manage());
    }

    @Test
    public void testWorkerEating() throws Exception {
        Assert.assertEquals("Alan eating", worker.eat());
    }

    @Test
    public void testSuperWorker() throws Exception {
        Assert.assertEquals("Mike eating",superWorker.eat());
    }

}
