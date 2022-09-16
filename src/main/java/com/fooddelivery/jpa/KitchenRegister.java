package com.fooddelivery.jpa;

import com.fooddelivery.domain.model.Kitchen;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class KitchenRegister {
    @PersistenceContext
    private EntityManager manager;

    public List<Kitchen> findAll() {
        TypedQuery<Kitchen> query = manager.createQuery("from Kitchen", Kitchen.class);

        return query.getResultList();
    }

    public Kitchen findById(Long id) {
        return manager.find(Kitchen.class, id);
    }

    @Transactional
    public Kitchen save(Kitchen kitchen) {
        return manager.merge(kitchen);
    }

    @Transactional
    public void delete(Kitchen kitchen) {
        kitchen = findById(kitchen.getId());
        manager.remove(kitchen);
    }
}
