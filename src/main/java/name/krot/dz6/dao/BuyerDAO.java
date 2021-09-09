package name.krot.dz6.dao;

import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class BuyerDAO {
    @Autowired
    EntityManagerFactory factory;

    public void save (Buyer buyer){
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(buyer);
        entityManager.getTransaction().commit();
    }
    public Buyer get (Long id){
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        Buyer reference = entityManager.find(Buyer.class, id);
        entityManager.getTransaction().commit();
        return reference;
    }
}
