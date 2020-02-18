package me.choi.demostudytesting;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Project : demostudytesting
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/18
 * Time : 10:50 오후
 */
public class FindSlowTestExtention implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final long THRESHHOLD = 1000L;

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        String testClassName = context.getRequiredTestClass().getName();
        String testMethodName = context.getRequiredTestMethod().getName();
        ExtensionContext.Store store = getStore(context, testClassName, testMethodName);
        store.put("START_TIME",System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        String testClassName = context.getRequiredTestClass().getName();
        String testMethodName = context.getRequiredTestMethod().getName();

        ExtensionContext.Store store = getStore(context, testClassName, testMethodName);
        Long start_time = store.remove("START_TIME", long.class);

        long duration = System.currentTimeMillis() - start_time;
        if (duration > THRESHHOLD) {
            System.out.printf("please consider mark method [%s] with @SlowTest.....\n",testMethodName);
        }
    }

    private ExtensionContext.Store getStore(ExtensionContext context, String testClassName, String testMethodName) {
        return context.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));
    }
}
