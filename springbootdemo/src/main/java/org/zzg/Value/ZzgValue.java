package org.zzg.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzhenguo
 * on 2018/7/13
 * info: SPRING_APPLICATION_JSON='{"acme":{"name":"test"}}' java -jar myapp.jar
 *       java -Dspring.application.json='{"name":"test"}' -jar myapp.jar
 *      java -jar myapp.jar --spring.application.json='{"name":"test"}'
 */
@Component
public class ZzgValue {

    Logger logger = LoggerFactory.getLogger(ZzgValue.class);
    @Value( "${name}" )
    private String name;

    public String getValue(){
        return name;
    }

}