package name.krot.dz6.dao;

import name.krot.dz6.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class GoodsDAO {
    @Autowired
    EntityManagerFactory factory;

    public void persist(Goods goods) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(goods);
        entityManager.getTransaction().commit();
    }

    public void merge(Goods goods) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(goods);
        entityManager.getTransaction().commit();
    }

    public Goods get(Long id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Goods reference = entityManager.find(Goods.class, id);
        entityManager.getTransaction().commit();
        return reference;
    }

}
