package me.choi.reflection.junwoodi;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:00 오후
 */
public class ContainerService {
    public static <T> T getObject(Class<T> classType) {
        T instance = createInstance(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(field -> {
            junwoo annotation = field.getAnnotation(junwoo.class);

            if (annotation != null) {
                Class<?> type = field.getType();
                Object fieldInstance = createInstance(type);
                field.setAccessible(true);

                try {
                    field.set(instance, fieldInstance);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });


        return instance;
    }

    private static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
