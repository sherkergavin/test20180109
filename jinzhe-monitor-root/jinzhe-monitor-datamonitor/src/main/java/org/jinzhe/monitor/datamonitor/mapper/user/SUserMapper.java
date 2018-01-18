package org.jinzhe.monitor.datamonitor.mapper.user;

import java.util.List;

import org.jinzhe.monitor.entity.user.SUser;


/**
 * 
* @ClassName: SUserMapper 
* @Description: mapper 接口
* @author GWJ
* @date 2017年11月17日 下午3:03:21 
*
 */
public interface SUserMapper {

	public List<SUser> queryUserSummary();
	
	
}
