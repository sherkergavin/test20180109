package org.jinzhe.monitor.earlywarning.datasource.config;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 
* @ClassName: MybatisConfig 
* @Description: entity 
* @author GWJ
* @date 2017年10月31日 下午12:00:40 
*
 */
@Configuration
@MapperScan("org.jinzhe.monitor.earlywarning.mapper.*")
@EnableTransactionManagement
public class MybatisConfig {
	
	@Autowired
	private DataSource dataSource;
	
	
	@Bean
	public PlatformTransactionManager confkonwTransactionManager(){
		
		return new DataSourceTransactionManager(dataSource);
	}	
	

	public SqlSessionFactory confSqlSessionFactory(){
		
		SqlSessionFactory  sqlSessionFactory = null;
		
		try{
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean(); 
			
			factoryBean.setDataSource(dataSource);
			
			PathMatchingResourcePatternResolver reslover = new PathMatchingResourcePatternResolver();
			
			Resource[] resArr = reslover.getResources("classpath:/mapper/*/*.xml");
			
			factoryBean.setMapperLocations(resArr);
			
			sqlSessionFactory = factoryBean.getObject();
			
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return sqlSessionFactory;
	}
	
	@Bean(name="sqlKnowSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(){
		
		return new SqlSessionTemplate(confSqlSessionFactory());
		
	}
	
}
