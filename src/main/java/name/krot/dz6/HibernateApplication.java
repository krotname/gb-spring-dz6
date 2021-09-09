package name.krot.dz6;

import name.krot.dz6.dao.BuyerDAO;
import name.krot.dz6.dao.GoodsDAO;
import name.krot.dz6.entity.Goods;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernateApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        GoodsDAO goodsDAO = context.getBean(GoodsDAO.class);
        BuyerDAO buyerDAO = context.getBean(BuyerDAO.class);

        Goods good = context.getBean(Goods.class);
        good.setPrice(100);
        good.setTitle("fkfkf");

        goodsDAO.save(good);



    }
}
