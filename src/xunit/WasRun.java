package xunit;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasBeforeEach;


    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
    }

    @Override
    public void beforeEach(){
        wasBeforeEach = true;
    }

}
