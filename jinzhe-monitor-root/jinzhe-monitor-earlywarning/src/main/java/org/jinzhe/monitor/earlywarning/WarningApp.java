package org.jinzhe.monitor.earlywarning;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * 
* @ClassName: WarningApp 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author GWJ
* @date 2017年11月22日 下午4:07:02 
*
 */

//@EnableEurekaClient
@SpringBootApplication(scanBasePackages="org.jinzhe.monitor.earlywarning.*",exclude={MybatisAutoConfiguration.class,DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class WarningApp 
{
    public static void main( String[] args )
    {
       SpringApplication.run(WarningApp.class, args);
    }
}
