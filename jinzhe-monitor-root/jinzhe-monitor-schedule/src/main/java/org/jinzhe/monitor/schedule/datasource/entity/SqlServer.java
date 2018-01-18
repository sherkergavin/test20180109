package org.jinzhe.monitor.schedule.datasource.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 
* @ClassName: SqlServer 
* @Description: entity
* @author GWJ
* @date 2017年11月27日 下午3:58:48 
*
 */
@Configuration
public class SqlServer {

	@Value("${sqlserver.driverClass}")
	private String driverClassName;
	
	@Value("${sqlserver.url}")
	private String url;
	
	@Value("${sqlserver.userName}")
	private String username;
	
	@Value("${sqlserver.passWord}")
	private String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SqlServer [driverClassName=" + driverClassName + ", url=" + url
				+ ", username=" + username + ", password=" + password + "]";
	}

}
