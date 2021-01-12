package xunit;

public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void beforeEach() {
        wasRun = new WasRun("testMethod");
    }

    public void testRunning() {
        Assert.assertEquals(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun);
    }

    public void testBeforeEach() {
        Assert.assertEquals(false, wasRun.wasBeforeEach);
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasBeforeEach);
    }

}
