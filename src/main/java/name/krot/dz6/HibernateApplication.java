package name.krot.dz6;

import name.krot.dz6.dao.BuyerDAO;
import name.krot.dz6.dao.GoodsDAO;
import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class HibernateApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        GoodsDAO goodsDAO = context.getBean(GoodsDAO.class);
        BuyerDAO buyerDAO = context.getBean(BuyerDAO.class);

        Goods morkov = context.getBean(Goods.class);
        morkov.setTitle("Морковь");
        morkov.setPrice(100);

        Goods sparzha = context.getBean(Goods.class);
        sparzha.setTitle("Спаржа");
        sparzha.setPrice(200);

        ArrayList<Goods> korzina = new ArrayList<>();

        Buyer vasia = context.getBean(Buyer.class);
        vasia.setName("Вася");
        //vasia.setGoods(korzina);

        sparzha.setBuyer(vasia);

        goodsDAO.save(morkov);
        goodsDAO.save(sparzha);

        Goods goods1 = goodsDAO.get(1L);
        Goods goods2 = goodsDAO.get(2L);
        Buyer buyer = buyerDAO.get(1L);

        System.out.println(goods1);
        System.out.println(goods2);
        System.out.println(buyer.getGoods());


    }
}
