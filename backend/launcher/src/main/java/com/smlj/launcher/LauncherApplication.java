package com.smlj.launcher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@EnableCaching
@EnableAsync
@EnableWebMvc
@EnableAspectJAutoProxy(exposeProxy = true) // http://www.voidcn.com/article/p-zddcuyii-bpt.html
// 有了 多数据源 和动态台数据源 需要屏蔽默认的数据源配置形式
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class/*, SecurityAutoConfiguration.class*/})
/*@MapperScan({"com.smlj.train.logic.o.vo.table.dao", "com.smlj.train.logic.o.vo.table.dao.common"})*/
public class LauncherApplication {
    public static void main(String[] args) {
        SpringApplication.run(LauncherApplication.class, args);
    }
}
