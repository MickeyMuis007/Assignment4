import Domain.CEO;
import Domain.Manager;
import Domain.Worker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/27.
 */
public class EmployeeTest {
    CEO ceo;
    Manager manager;
    Worker worker;
    @Before
    public void setUp() throws Exception {
        worker = new Worker();
        ceo = new CEO();
        manager = new Manager();
    }

    @Test
    public void testCEO() throws Exception {
        Assert.assertEquals("CEO working", ceo.work());
    }

    @Test
    public void testManager() throws Exception {
        manager.setWorker(worker);
        Assert.assertEquals("Manager manage Worker working", manager.manage());
    }

    @Test
    public void testWorker() throws Exception {
        Assert.assertEquals("Worker working", worker.work());
    }
}
