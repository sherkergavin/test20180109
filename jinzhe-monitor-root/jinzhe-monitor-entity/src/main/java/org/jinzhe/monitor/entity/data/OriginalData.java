package org.jinzhe.monitor.entity.data;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: OriginalData 
* @Description: 原始数据
* @author GWJ
* @date 2017年11月28日 上午11:15:21 
*
 */
public class OriginalData {
	//主键
	private Long sysId;
	//站名
	private String stationName;
	//字段描述
	private String aliName;
	//标记名
	private String tagName;
	//数值
	private Float logVal;
	//时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date logTime;
    //单位
	private String unit;
	//站点类型
	private String type;
	//是否有效标记
	private Integer mark;
	//DataItemInfo外键 
	private Long dataItemId;
	
	/**
	 * @see 主键
	 */
	public Long getSysId() {
		return sysId;
	}
	/**
	 * @see 主键
	 */
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
	/**
	 * @see 站名
	 */
	public String getStationName() {
		return stationName;
	}
	/**
	 * @see 站名
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	/**
	 * @see 字段描述
	 */
	public String getAliName() {
		return aliName;
	}
	/**
	 * @see 字段描述
	 */
	public void setAliName(String aliName) {
		this.aliName = aliName;
	}
	/**
	 * @see 标记名
	 */
	public String getTagName() {
		return tagName;
	}
	/**
	 * @see 标记名
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	/**
	 * @see 数值
	 */
	public Float getLogVal() {
		return logVal;
	}
	/**
	 * @see 数值
	 */
	public void setLogVal(Float logVal) {
		this.logVal = logVal;
	}
	/**
	 * @see 时间
	 */
	public Date getLogTime() {
		return logTime;
	}
	/**
	 * @see 时间
	 */
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
	/**
	 * @see 单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @see 单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @see 站点类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * @see 站点类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @see 是否有效标记
	 */
	public Integer getMark() {
		return mark;
	}
	/**
	 * @see 是否有效标记
	 */
	public void setMark(Integer mark) {
		this.mark = mark;
	}

	/**
	 * @see DataItemInfo外键 
	 */
	public Long getDataItemId() {
		return dataItemId;
	}
	/**
	 * @see DataItemInfo外键 
	 */
	public void setDataItemId(Long dataItemId) {
		this.dataItemId = dataItemId;
	}
	
	@Override
	public String toString() {
		return "OriginalData [sysId=" + sysId + ", stationName=" + stationName
				+ ", aliName=" + aliName + ", tagName=" + tagName + ", logVal="
				+ logVal + ", logTime=" + logTime + ", unit=" + unit
				+ ", type=" + type + ", mark=" + mark + ", dataItemId="
				+ dataItemId + "]";
	}

}
