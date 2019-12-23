package me.choi.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {

    public static <T> T getObject(Class<T> classType) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        T instance = createInstance(classType);

        Arrays.stream(classType.getDeclaredFields()).forEach(f -> {

            if(f.getAnnotation(Inject.class) != null) {
                Object fieldInstance = createInstance(f.getType());
                System.out.println(fieldInstance);
                f.setAccessible(true);
                try {
                    f.set(instance, fieldInstance);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException();
                }
            }
        });

        return instance;
    }

    public static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
