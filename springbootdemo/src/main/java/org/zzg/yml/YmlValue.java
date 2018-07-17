package org.zzg.yml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.List;

/**
 * Created by zhangzhenguo
 * on 2018/7/16
 * ianfo:从application.yml中获取变量值
 */
@ConfigurationProperties(prefix="my")
@Data
@Component
public class YmlValue {


    private List<String> servers;

    @Value( "${myserver.address}" )
    private String serverAddress;


    private boolean enabled;

    private InetAddress remoteAddress;


    public void showYmlDefList(){
        System.out.println( "===================从yml中读取list开始===================" );
        for(String str:servers){
            System.out.println( str );
        }
        System.out.println( "===================从yml中读取list结束===================" );
        System.out.println( "===================从yml中读取value开始===================" );
        System.out.println( enabled );
        System.out.println( remoteAddress );
        System.out.println( "===================从yml中读取value结束===================" );


    }


    public void showProfileActiveValue(){
        System.out.println( "===================激活的是环境的server开始===================" );
        System.out.println( serverAddress );
        System.out.println( "===================激活的是环境的server结束===================" );
    }


}
