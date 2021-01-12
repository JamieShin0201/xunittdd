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

    public void testResult() {
        WasRun wasRun = new WasRun("testMethod");
        TestResult result = wasRun.run();
        Assert.assertEquals("1 run, 0 failed", result.getSummary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

    public void testFailedResult() {
        WasRun wasRun = new WasRun("testBrokenMethod");
        TestResult result = wasRun.run();
        Assert.assertEquals("1 run, 1 failed", result.getSummary());
    }

}
