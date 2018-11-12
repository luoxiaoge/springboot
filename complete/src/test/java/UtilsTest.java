import BaseTest.BaseTest;
import com.luoc.config.DruidDataSourceConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author luoc
 * @date 2018/11/12 0012
 * @Time 9:52
 */
@SpringBootTest
public class UtilsTest  extends BaseTest {

    @Test
     public void druidTest(){
        DruidDataSourceConfiguration druidDataSourceConfiguration = new DruidDataSourceConfiguration();

        System.out.println(druidDataSourceConfiguration.druidDataSource());
     }
}
