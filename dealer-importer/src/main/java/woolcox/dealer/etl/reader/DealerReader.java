package woolcox.dealer.etl.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.*;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import woolcox.dealer.domain.Dealer;

/**
 * Created by woolcoxs on 15-08-01.
 */
@Component
public class DealerReader implements ItemReader<Dealer>, ItemStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(DealerReader.class);

    @Autowired
    private DealerMapper mapper;
    private FlatFileItemReader<Dealer> reader;

    @Override
    public Dealer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        Dealer dealer = reader.read();

        if (null != dealer) {
            LOGGER.info(String.format("Read dealer bac: %s", dealer.getDealerCode().getBac()));
        }
        return dealer;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        reader = new FlatFileItemReader<>();
        reader.setResource(new ClassPathResource("dealer.csv"));

        DefaultLineMapper<Dealer> lineMapper = new DefaultLineMapper<>();
        lineMapper.setLineTokenizer(new DelimitedLineTokenizer());
        lineMapper.setFieldSetMapper(mapper);
        reader.setLineMapper(lineMapper);
        reader.open(executionContext);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void close() throws ItemStreamException {
        reader.close();
    }
}
