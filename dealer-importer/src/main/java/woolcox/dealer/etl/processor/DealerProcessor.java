package woolcox.dealer.etl.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import woolcox.dealer.domain.Dealer;

/**
 * Created by Mark on 2015-08-01.
 */
@Component
public class DealerProcessor implements ItemProcessor<Dealer, Dealer>{

    @Override
    public Dealer process(Dealer dealer) throws Exception {
        return null;
    }
}
