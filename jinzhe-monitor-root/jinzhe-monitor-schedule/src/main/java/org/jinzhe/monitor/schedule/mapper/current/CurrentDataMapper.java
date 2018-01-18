package org.jinzhe.monitor.schedule.mapper.current;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.jinzhe.monitor.entity.data.OriginalData;


/**
 * 
* @ClassName: CurrentDataMapper 
* @Description: mapper
* @author GWJ
* @date 2017年11月27日 下午4:47:00 
*
 */
public interface CurrentDataMapper {


	public List<OriginalData> queryCurrentData();
	
	public void putCurrentData(@Param("list") List<OriginalData> list);
	
	public void updCurrentData(@Param("list") List<OriginalData> list);

	public void delCurrentData();
	
}
