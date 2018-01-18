package org.jinzhe.monitor.schedule.datasource.config;

import java.beans.PropertyVetoException;

import org.jinzhe.monitor.schedule.datasource.entity.C3p0;
import org.jinzhe.monitor.schedule.datasource.entity.Oracle;
import org.jinzhe.monitor.schedule.datasource.entity.SqlServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
* @ClassName: DataSourceConfig 
* @Description: config
* @author GWJ
* @date 2017年11月24日 上午11:47:18 
*
 */
@Configuration
public class DataSourceConfig {

	@Autowired
	private C3p0 c3p0;
	@Autowired
	private SqlServer sqlServer;
	@Autowired
	private Oracle oracle;
	
	
	@Bean(destroyMethod="close")
	public ComboPooledDataSource confSqlServerComboPooledDataSource(){
		
		ComboPooledDataSource DataSource = new ComboPooledDataSource();
		try{
			DataSource.setJdbcUrl(sqlServer.getUrl());
			DataSource.setUser(sqlServer.getUsername());
			DataSource.setPassword(sqlServer.getPassword());
			DataSource.setDriverClass(sqlServer.getDriverClassName());
			
			DataSource.setMaxPoolSize(c3p0.getMaxPoolSize());
			DataSource.setMinPoolSize(c3p0.getMinPoolSize());
			DataSource.setInitialPoolSize(c3p0.getInitialPoolSize());
			//DataSource.setCheckoutTimeout(c3p0.getCheckoutTimeout());
			DataSource.setMaxStatements(c3p0.getMaxStatements());
			DataSource.setIdleConnectionTestPeriod(c3p0.getIdleConnectionTestPeriod());
			DataSource.setAcquireIncrement(c3p0.getAcquireIncrement());
			DataSource.setMaxIdleTime(c3p0.getMaxIdleTime());
			DataSource.setNumHelperThreads(c3p0.getNumHelperThreads());
			
		}catch(PropertyVetoException ex){
			
			ex.printStackTrace();
		}
		
		return DataSource;
	}
	
	
	@Bean(destroyMethod="close")
	public ComboPooledDataSource confOracleComboPooledDataSource(){
		
		ComboPooledDataSource DataSource = new ComboPooledDataSource();
		try{
			DataSource.setJdbcUrl(oracle.getUrl());
			DataSource.setUser(oracle.getUsername());
			DataSource.setPassword(oracle.getPassword());
			DataSource.setDriverClass(oracle.getDriverClassName());
			
			DataSource.setMaxPoolSize(c3p0.getMaxPoolSize());
			DataSource.setMinPoolSize(c3p0.getMinPoolSize());
			DataSource.setInitialPoolSize(c3p0.getInitialPoolSize());
			//DataSource.setCheckoutTimeout(c3p0.getCheckoutTimeout());
			DataSource.setMaxStatements(c3p0.getMaxStatements());
			DataSource.setIdleConnectionTestPeriod(c3p0.getIdleConnectionTestPeriod());
			DataSource.setAcquireIncrement(c3p0.getAcquireIncrement());
			DataSource.setMaxIdleTime(c3p0.getMaxIdleTime());
			DataSource.setNumHelperThreads(c3p0.getNumHelperThreads());
			
		}catch(PropertyVetoException ex){
			
			ex.printStackTrace();
		}
		
		return DataSource;
	}
	
	
	
}
