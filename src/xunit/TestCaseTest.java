package xunit;

public class TestCaseTest extends TestCase{

    public TestCaseTest(String name) {
        super(name);
    }

    public void templateMethod() {
        WasRun wasRun = new WasRun("testMethod");
        wasRun.run();
        Assert.assertEquals("beforeEach testMethod afterEach", wasRun.log);
    }

}
