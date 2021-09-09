package name.krot.dz6.service;

import name.krot.dz6.dao.BuyerDAO;
import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BuyerService {

    @Autowired
    BuyerDAO buyerDAO;

    public List<Goods> getListGoods(Long buyerId) {
        Buyer buyer = buyerDAO.get(buyerId);
        return buyer.getGoods();
    }
}
