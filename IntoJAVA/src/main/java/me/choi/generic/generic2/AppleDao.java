package me.choi.generic.generic2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:15 오후
 */
public class AppleDao {

    private Map<Integer, Apple> dataSource = new HashMap<>();

    public void save(Apple apple) {
        dataSource.put(apple.getId(), apple);
    }

    public void delete(Apple apple) {
        dataSource.remove(apple.getId());
    }

    public void delete(Integer integer) {
        dataSource.remove(integer);
    }

    public List<Apple> findAll() {
        return new ArrayList<>(dataSource.values());
    }

    public Apple findById(Integer id) {
        return dataSource.get(id);
    }

}
