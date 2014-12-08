package org.alex.data.mining.iris;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by huzhongyuan on 14/12/8.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("/applicationContext.xml")
public class MainServer implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(MainServer.class);
    @Autowired
    private Properties configproperties;

    /**
     * 启动目录监听程序.
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Object[]{
                MainServer.class
        }, args);
    }

    @Override
    public void run (String... args) throws Exception {

    }

}
