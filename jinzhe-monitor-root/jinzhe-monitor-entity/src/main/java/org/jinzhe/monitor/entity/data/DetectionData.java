package org.jinzhe.monitor.entity.data;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 
* @ClassName: DetectionData 
* @Description: 水质检测对象(华存处理过的)
* @author GWJ
* @date 2017年11月24日 下午1:59:05 
*
 */
public class DetectionData {
	//主键
	private long dataItemId;
	//边界服务器时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date dateTime;
	//入库时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	//检测值
	private Double dataVal;
	//数据新鲜度
	private String freshRate;
	//越界标签
	private String overFlowFlag;
	//毛刺标签
	private String burrFlag;
	//毛刺修正值
	private Double burrConfirmVal;
	
	/**
	 * @see 主键
	 */
	public long getDataItemId() {
		return dataItemId;
	}
	/**
	 * @see 主键
	 */
	public void setDataItemId(long dataItemId) {
		this.dataItemId = dataItemId;
	}
	/**
	 * @see 边界服务器时间
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * @see 边界服务器时间
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @see 入库时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @see 入库时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @see 检测值
	 */
	public Double getDataVal() {
		return dataVal;
	}
	/**
	 * @see 检测值
	 */
	public void setDataVal(Double dataVal) {
		this.dataVal = dataVal;
	}
	/**
	 * @see 数据新鲜度
	 */
	public String getFreshRate() {
		return freshRate;
	}
	/**
	 * @see 数据新鲜度
	 */
	public void setFreshRate(String freshRate) {
		this.freshRate = freshRate;
	}
	/**
	 * @see 越界标签
	 */
	public String getOverFlowFlag() {
		return overFlowFlag;
	}
	/**
	 * @see 越界标签
	 */
	public void setOverFlowFlag(String overFlowFlag) {
		this.overFlowFlag = overFlowFlag;
	}
	/**
	 * @see 毛刺标签
	 */
	public String getBurrFlag() {
		return burrFlag;
	}
	/**
	 * @see 毛刺标签
	 */
	public void setBurrFlag(String burrFlag) {
		this.burrFlag = burrFlag;
	}
	/**
	 * @see 毛刺修正值
	 */
	public Double getBurrConfirmVal() {
		return burrConfirmVal;
	}
	/**
	 * @see 毛刺修正值
	 */
	public void setBurrConfirmVal(Double burrConfirmVal) {
		this.burrConfirmVal = burrConfirmVal;
	}

	@Override
	public String toString() {
		return "DetectionData [dataItemId=" + dataItemId + ", dateTime="
				+ dateTime + ", updateTime=" + updateTime + ", dataVal="
				+ dataVal + ", freshRate=" + freshRate + ", overFlowFlag="
				+ overFlowFlag + ", burrFlag=" + burrFlag + ", burrConfirmVal="
				+ burrConfirmVal + "]";
	}

}
