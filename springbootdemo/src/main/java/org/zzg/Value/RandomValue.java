package org.zzg.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzhenguo
 * on 2018/7/13
 * info:Configuring Random Values
 */
@Component
public class RandomValue {
    @Value( "${my.value}" )
    private String randValue;
    @Value( "${my.int}" )
    private int randInt;
    @Value( "${my.long}" )
    private long randLong;
    @Value( "${my.uuid}" )
    private String uuid;
    @Value( "${my.int.less.than.ten}" )
    private int lessRandInt;
    @Value( "${my.int.in.range}" )
    private int rangeInt;


    public void getAllValue(){
        System.out.println( "===========Configuring Random Values Begin =========" );
        System.out.println( randValue );
        System.out.println( randInt );
        System.out.println( randLong );
        System.out.println( uuid );
        System.out.println( lessRandInt );
        System.out.println( rangeInt );
        System.out.println( "===========Configuring Random Values End =========" );
    }


}
