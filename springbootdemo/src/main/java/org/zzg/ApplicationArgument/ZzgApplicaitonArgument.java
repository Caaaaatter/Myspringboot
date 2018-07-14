package org.zzg.ApplicationArgument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhangzhenguo
 * on 2018/7/13
 * info:命令行 运行时获取输入参数
 */
@Component
public class ZzgApplicaitonArgument {
    Logger logger = LoggerFactory.getLogger(ZzgApplicaitonArgument.class);
   @Autowired
   public ZzgApplicaitonArgument(ApplicationArguments applicationArguments){
       boolean argument = applicationArguments.containsOption( "debug" );
       List<String> optionValue = applicationArguments.getOptionValues( "debug" );
       logger.info( "command contains debug:{}(by ApplicationArguments)",argument );
       logger.info( "debug vlaues:{}(by ApplicationArguments)",optionValue );
   }
}
