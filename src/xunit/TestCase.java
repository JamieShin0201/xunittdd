package xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase implements Test{
    protected final String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) {
        result.testStarted();

        beforeEach();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e){
            result.testFailed();
        }

        afterEach();
    }

    public void beforeEach() {

    }

    public void afterEach() {
    }
}
