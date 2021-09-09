package name.krot.dz6;

import name.krot.dz6.entity.Goods;
import name.krot.dz6.service.BuyerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class HibernateApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);

        BuyerService buyerService = context.getBean(BuyerService.class);
        List<Goods> listGoods = buyerService.getListGoods(1L);
        System.out.println(listGoods);
    }
}
