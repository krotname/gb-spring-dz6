package name.krot.dz6;

import name.krot.dz6.entity.Buyer;
import name.krot.dz6.entity.Goods;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

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
}
