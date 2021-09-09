package name.krot.dz6;

import name.krot.dz6.dao.BuyerDAO;
import name.krot.dz6.dao.GoodsDAO;
import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import name.krot.dz6.service.BuyerService;
import name.krot.dz6.service.GoodsService;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.persistence.EntityManagerFactory;

public class SpringContextConfiguration {
    @Bean
    @Scope("prototype")
    public Goods goods() {
        return new Goods();
    }

    @Bean
    @Scope("prototype")
    public Buyer buyer() {
        return new Buyer();
    }

    @Bean
    public GoodsDAO goodsDAO() {
        return new GoodsDAO();
    }

    @Bean
    public BuyerDAO buyerDAO() {
        return new BuyerDAO();
    }

    @Bean
    public GoodsService goodsService() {
        return new GoodsService();
    }

    @Bean
    public BuyerService buyerService() {
        return new BuyerService();
    }

    @Bean
    public EntityManagerFactory factory() {
        return new Configuration().configure().buildSessionFactory();
    }
}
