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
public class BananaDao {

    private Map<Integer, Banana> dataSource = new HashMap<>();

    public void save(Banana banana) {
        dataSource.put(banana.getId(), banana);
    }

    public void delete(Banana banana) {
        dataSource.remove(banana.getId());
    }

    public void delete(Integer integer) {
        dataSource.remove(integer);
    }

    public List<Banana> findAll() {
        return new ArrayList<>(dataSource.values());
    }

    public Banana findById(Integer id) {
        return dataSource.get(id);
    }

}
