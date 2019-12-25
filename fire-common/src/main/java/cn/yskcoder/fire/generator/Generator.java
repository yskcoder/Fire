package cn.yskcoder.fire.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * 自动生成Mybatis相关的代码和配置文件
 *
 * @author: yskcoder
 * @createDate: 2019/12/25 18:59
 * @version: 1.0
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        InputStream stream = Class.class.getResourceAsStream("/mybatis-generator.xml");
        Configuration config =
                cp.parseConfiguration(stream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("恭喜你，生成Mybatis相关的代码完成！");
    }
}