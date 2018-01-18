package org.jinzhe.monitor.schedule.mapper.current;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.jinzhe.monitor.entity.data.OriginalData;
/**
 * 
* @ClassName: HistroyDataMapper 
* @Description: Mapper
* @author GWJ
* @date 2017年11月29日 下午3:37:07 
*
 */
public interface HistoryDataMapper {

	
	
	public void putHistoryData(@Param("list") List<OriginalData> list);
	
	
}
