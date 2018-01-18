package org.jinzhe.monitor.datamonitor.mapper.huacun;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.jinzhe.monitor.entity.data.OriginalData;


/**
 * 
* @ClassName: HuaCunMapper 
* @Description: mapper
* @author GWJ
* @date 2017年11月28日 下午2:25:30 
*
 */
public interface HuaCunMapper {

	public void putOriginalData(@Param("list") List<OriginalData> list);
	
	

	
	
	
	public void putElemOriginalData(@Param("sysId") Long sysId,
									@Param("stationName")String stationName,
									@Param("aliName")String aliName,
									@Param("tagName")String tagName,
									@Param("logVal")Float logVal,
									@Param("logTime")Date logTime,
									@Param("unit")String unit,
									@Param("type")String type,
									@Param("mark")Integer mark);
	
}
