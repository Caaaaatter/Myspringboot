package org.zzg.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzhenguo
 * on 2018/7/16
 * info:
 */
@Component
public class YmlAll {


    @Autowired
    private YmlValue ymlValue;

    public void show(){
        ymlValue.showYmlDefList();
        ymlValue.showProfileActiveValue();
    }
}
