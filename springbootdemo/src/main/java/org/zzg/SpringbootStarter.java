package org.zzg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zzg.Value.ValueAll;
import org.zzg.Value.ZzgValue;
import org.zzg.yml.YmlAll;

/**
 * Created by zhangzhenguo
 * on 2018/7/10
 * info:
 */
//@EnableAutoConfiguration
//@RestController
@SpringBootApplication
@RestController
public class SpringbootStarter {


    @Autowired
    private ValueAll valueAll;

    @Autowired
    private YmlAll ymlAll;

    @RequestMapping("/")
    public String hello(){
        valueAll.show();
        ymlAll.show();
        return "waht are sssyou nongs ha nei";
    }


    public static void main(String[] args) {
        SpringApplication.run( SpringbootStarter.class,args );
    }

}
