package me.choi;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Container {

    public static <T> T getObject(Class<T> classType) {

        return createInstance(classType);
    }
    public static <T> T getObjectRepository(Class<T> classType) {
        T instance = createInstance(classType);

        Arrays.stream(classType.getDeclaredFields()).forEach(field -> {
            if(field.getAnnotation(mesung.class) != null) {
                Object fieldInstance = createInstance(field.getType());
                try {
                    field.setAccessible(true);
                    field.set(instance, fieldInstance);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException();
                }

            }
        });

        return instance;

    }



    private static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException();
        }
    }
}
