package org.jinzhe.monitor.datamonitor.datasource.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
/**
 * 
* @ClassName: Oracle 
* @Description: entity
* @author GWJ
* @date 2017年11月17日 下午2:34:06 
*
 */
@Configuration
public class Oracle {

	@Value("${oracle.driverClass}")
	private String driverClassName;
	
	@Value("${oracle.url}")
	private String url;
	
	@Value("${oracle.userName}")
	private String username;
	
	@Value("${oracle.passWord}")
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
		return "Oracle [driverClassName=" + driverClassName + ", url=" + url
				+ ", username=" + username + ", password=" + password + "]";
	}


}
