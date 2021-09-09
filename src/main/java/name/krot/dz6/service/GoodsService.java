package name.krot.dz6.service;

import name.krot.dz6.dao.BuyerDAO;
import name.krot.dz6.dao.GoodsDAO;
import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GoodsService {
    @Autowired
    GoodsDAO goodsDAO;

    @Autowired
    BuyerDAO buyerDAO;

    public List<Buyer> getListBuyers(Long goodsId) {
        Goods goods = goodsDAO.get(goodsId);
        Buyer buyer = goods.getBuyer();
        ArrayList<Buyer> buyers = new ArrayList<>();
        buyers.add(buyer);
        return buyers;
    }

    public double getPrice(Long goodsId, Long buyerId) {
        double r = 0;
        Goods goods = goodsDAO.get(goodsId);
        Buyer buyer = buyerDAO.get(buyerId);
        if (goods.getBuyer().equals(buyer)){
            r = goods.getPrice();
        }
        return r;
    }
}
