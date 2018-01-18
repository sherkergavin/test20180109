package org.jinzhe.monitor.schedule.datasource.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
* @ClassName: MybatisConfig 
* @Description: config
* @author GWJ
* @date 2017年11月24日 上午11:47:03 
*
 */
@Configuration
@EnableTransactionManagement
@MapperScan("org.jinzhe.monitor.schedule.mapper.*")
public class MybatisConfig {

	@Autowired
	@Qualifier("confSqlServerComboPooledDataSource")
	private DataSource sqlServerDataSource;
	
	

	@Autowired
	@Qualifier("confOracleComboPooledDataSource")
	private DataSource oracleDataSource;
	
	
	@Bean("confSqlServerTransactionManager")
	public PlatformTransactionManager confSqlServerTransactionManager(){
		
		return new DataSourceTransactionManager(sqlServerDataSource);
	}
	
	@Bean("confOracleTransactionManager")
	public PlatformTransactionManager confOracleTransactionManager(){
		
		return new DataSourceTransactionManager(oracleDataSource);
	}
	
	
	public SqlSessionFactory confSqlServerSqlSessionFactory(){
		
		SqlSessionFactory  sqlSessionFactory = null;
		
		try{
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean(); 
			
			factoryBean.setDataSource(sqlServerDataSource);
			
			PathMatchingResourcePatternResolver reslover = new PathMatchingResourcePatternResolver();
			
			Resource[] resArr = reslover.getResources("classpath:/mapper/*/*.xml");
			
			factoryBean.setMapperLocations(resArr);
			
			sqlSessionFactory = factoryBean.getObject();
			
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return sqlSessionFactory;
	}
	
	public SqlSessionFactory confOracleSqlSessionFactory(){
		
		SqlSessionFactory  sqlSessionFactory = null;
		
		try{
			SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean(); 
			
			factoryBean.setDataSource(oracleDataSource);
			
			PathMatchingResourcePatternResolver reslover = new PathMatchingResourcePatternResolver();
			
			Resource[] resArr = reslover.getResources("classpath:/mapper/*/*.xml");
			
			factoryBean.setMapperLocations(resArr);
			
			sqlSessionFactory = factoryBean.getObject();
			
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return sqlSessionFactory;
	}
	
	

	@Bean(name="sqlOracleSessionTemplate")
	public SqlSessionTemplate sqlOracleSessionTemplate(){
		
		return new SqlSessionTemplate(confOracleSqlSessionFactory());
		
	}
	
	@Primary
	@Bean(name="sqlSqlServerSessionTemplate")
	public SqlSessionTemplate sqlSqlServerSessionTemplate(){
		
		return new SqlSessionTemplate(confSqlServerSqlSessionFactory());
		
	}
	
}
