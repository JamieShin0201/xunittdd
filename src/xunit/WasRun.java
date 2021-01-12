package xunit;

public class WasRun extends TestCase {

    public String log;


    public WasRun(String name) {
        super(name);
    }

    @Override
    public void beforeEach(){
        log = "beforeEach";
    }

    public void testMethod() {
        log += " testMethod";
    }

    @Override
    public void afterEach() {
        log += " afterEach";
    }
}
