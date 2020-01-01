package me.choi.inflearnthejavatest;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class FindSlowTestExtention implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static long THRESHOLD = 1000L;

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
//        extensionContext : 값을 저장하는 store
        ExtensionContext.Store store = getStore(extensionContext);
        store.put("START TIME", System.currentTimeMillis());
    }

@Override
public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
    Method testMethod = extensionContext.getRequiredTestMethod();
    SlowTest annotation = testMethod.getAnnotation(SlowTest.class);

    String testMethodName = testMethod.getName();
    ExtensionContext.Store store = getStore(extensionContext);

    Long start_time = store.remove("START TIME", long.class);
    Long duration = System.currentTimeMillis() - start_time;

    if(duration > THRESHOLD && annotation ==null) {
        System.out.printf("Pleas consider mark method [%s] with @SlowTEST \n", testMethodName);
    }
}

    private ExtensionContext.Store getStore(ExtensionContext extensionContext) {
        String testClassName = extensionContext.getRequiredTestClass().getName();
        String testMethodName = extensionContext.getRequiredTestMethod().getName();

        return extensionContext.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));
    }

}
