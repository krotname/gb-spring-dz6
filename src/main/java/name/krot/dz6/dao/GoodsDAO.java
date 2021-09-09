package name.krot.dz6.dao;

import name.krot.dz6.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class GoodsDAO {
    @Autowired
    EntityManagerFactory factory;

    public void save (Goods goods){
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(goods);
        entityManager.getTransaction().commit();
    }

}
