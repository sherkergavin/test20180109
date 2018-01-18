package org.jinzhe.monitor.earlywarning.datasource.config;

import java.beans.PropertyVetoException;

import org.jinzhe.monitor.earlywarning.datasource.entity.C3p0;
import org.jinzhe.monitor.earlywarning.datasource.entity.Oracle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
* @ClassName: DataSourceConfig 
* @Description: entity
* @author GWJ
* @date 2017年10月31日 上午11:39:18 
*
 */
@Configuration
public class DataSourceConfig {

	@Autowired
	private Oracle oracle;
	@Autowired
	private C3p0 c3p0;
	
	
	@Bean(destroyMethod="close")
	public ComboPooledDataSource confKnowComboPooledDataSource(){
		
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
