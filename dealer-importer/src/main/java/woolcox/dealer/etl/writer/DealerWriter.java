package woolcox.dealer.etl.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
import woolcox.dealer.domain.Dealer;

import java.util.List;

/**
 * Created by woolcoxs on 15-08-01.
 */
@Component
public class DealerWriter implements ItemWriter<Dealer> {
    @Override
    public void write(List<? extends Dealer> list) throws Exception {

    }
}
