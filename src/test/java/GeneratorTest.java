import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chl
 * @version 1.0
 * @date 2019/12/16 18:31
 */
public class GeneratorTest {

    @Test
    public void test() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings=new ArrayList<String>();
        ConfigurationParser parser=new ConfigurationParser(warnings);
        Configuration configuration=parser.parseConfiguration(new File("src\\main\\resources\\generator.xml"));
        DefaultShellCallback callback=new DefaultShellCallback(true);
        MyBatisGenerator generator=new MyBatisGenerator(configuration,callback,warnings);
        generator.generate(null);
    }
}
