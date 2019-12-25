package cn.yskcoder.fire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FireApplication {
    private final static Logger logger = LoggerFactory.getLogger(FireApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FireApplication.class, args);
        logger.info(FireApplication.class.getSimpleName() + " is success!");
    }
}
