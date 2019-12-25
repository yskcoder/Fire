package cn.yskcoder.fire.config;

import cn.yskcoder.fire.config.properties.DruidProperties;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * mybatisConfig配置类
 *
 * @author:       yskcoder
 * @createDate:    2019/12/25 17:41
 * @version:      1.0
*/
@Configuration
public class MyBatisConfig {
    @Autowired
    DruidProperties druidProperties;


    /**
     * Fire数据源
     */
    private DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        return dataSource;
    }

    @Bean
    public DruidDataSource datasource() {
        return dataSource();
    }
}
