package org.jinzhe.monitor.datamonitor.mapper.current;

import java.util.List;

import org.jinzhe.monitor.entity.data.DetectionData;

/**
 * 
* @ClassName: CurrentDataMapper 
* @Description: mapper
* @author GWJ
* @date 2017年11月27日 下午5:12:00 
*
 */
public interface CurrentDataMapper {

	/**
	 * 
	* @Title: queryCurrentData 
	* @Description: 查询本地实时数据
	* @param @return    设定文件 
	* @return List<DetectionData>    返回类型 
	* @throws
	 */
	public List<DetectionData> queryCurrentData();
	/**
	 * 
	* @Title: delCurrentData 
	* @Description: 删除本地实时数据
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void delCurrentData();
	/**
	 * 
	* @Title: putCurrentData 
	* @Description: 将实时数据追加到本地实时库
	* @param @param list    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void putCurrentData(List<DetectionData> list);
	/**
	 * 
	* @Title: putHistoryData 
	* @Description: 将实时数据追加到历史库 
	* @param @param list    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void putHistoryData(List<DetectionData> list);
	
}
