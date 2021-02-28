package me.choi.generic.genericfruit;

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
public class GenericDao<E extends Entity<K>, K> {

    public Class<E> entityClass;

    public GenericDao(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public Class<E> getEntityClass() {
        return entityClass;
    }

    private Map<K, E> dataSource = new HashMap<>();

    public void save(E entity) {
        dataSource.put(entity.getId(), entity);
    }

    public void delete(E entity) {
        dataSource.remove(entity.getId());
    }

    public void delete(K id) {
        dataSource.remove(id);
    }

    public List<E> findAll() {
        return new ArrayList<>(dataSource.values());
    }

    public E findById(K id) {
        return dataSource.get(id);
    }

}
