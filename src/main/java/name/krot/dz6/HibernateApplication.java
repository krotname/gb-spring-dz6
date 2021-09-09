package name.krot.dz6;

import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import name.krot.dz6.service.BuyerService;
import name.krot.dz6.service.GoodsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class HibernateApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);

        BuyerService buyerService = context.getBean(BuyerService.class);
        List<Goods> listGoods = buyerService.getListGoods(1L);
        System.out.println(listGoods);

        GoodsService goodsService = context.getBean(GoodsService.class);
        List<Buyer> listBuyers = goodsService.getListBuyers(3L);
        System.out.println(listBuyers);

    }
}
