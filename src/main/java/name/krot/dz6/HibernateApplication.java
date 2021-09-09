package name.krot.dz6;

import name.krot.dz6.entity.Goods;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernateApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        Goods goods = context.getBean(Goods.class);
        goods.setPrice(100);
        goods.setTitle("fkfkf");

        EntityManagerFactory factory = new Configuration().configure().buildSessionFactory();
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        //save
        entityManager.persist(goods);
        entityManager.getTransaction().commit();


        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();


        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();

    }
}
