package woolcox.dealer.etl.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
import woolcox.dealer.domain.Dealer;
import woolcox.dealer.domain.DealerCode;

/**
 * Created by Mark on 2015-08-01.
 */
public class DealerMapper implements FieldSetMapper<Dealer> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DealerMapper.class);

    @Override
    public Dealer mapFieldSet(FieldSet fieldSet) throws BindException {

        if (null == fieldSet) {
            return null;
        }

        Dealer dealer = new Dealer();
        DealerCode dealerCode = new DealerCode();
        dealerCode.setBac(fieldSet.readString(0));
        dealer.setDealerCode(dealerCode);

        return dealer;
    }
}
