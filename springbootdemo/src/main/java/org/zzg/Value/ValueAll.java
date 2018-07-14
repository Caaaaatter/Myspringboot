package org.zzg.Value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzhenguo
 * on 2018/7/13
 * info:
 */
@Component
public class ValueAll {
    @Autowired
    private RandomValue randomValue;

    @Autowired
    private ZzgValue zzgValue;


    public void show(){
        randomValue.getAllValue();
        zzgValue.getValue();
    }


}
