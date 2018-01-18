package org.jinzhe.monitor.entity.datainfo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: DataItemInfo 
* @Description: 数据项属性信息表
* @author GWJ
* @date 2017年12月1日 下午3:32:08 
*
 */
public class DataItemInfo {
	//主鍵
	private Long dataItemId;
	//数据项名称
	private String dataItemName;
	//数据项类型ID
	private Long dataItemTypeId;
	//数据项大类ID
	private Long dataItemPTypeId;
	//设备对象ID
	private Long equipmentId;
	//设备对象名称
	private String equipmentName;
	//水源系统ID
	private Long wsSysId;
	//水源系统名称
	private String wsSysName;
	//所属站点ID
	private Long stationId;
	//所属管线ID
	private Long pipeId;
	//数据单位
	private String dataUnit;
	//报警上限
	private Long alarmUpper;
	//报警下限
	private Long alarmLower;
	//源头SCADA系统ID
	private Long scadaId;
	//源头SCADA系统SYSID
	private String sysIdAll;
	//来源表ID
	private Long srcTableId;
	//备注
	private String remark;
	//删除标记
	private Integer df;
	//排序
	private Integer sort;
	//创建时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	//修改时间
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	//备用字段1
	private String def1;
	//备用字段2
	private String def2;
	//备用字段3
	private String def3;
	//SYSID
	private Long sysId;
	//计算类别
	private Long computeType;
	//原水清水系统分类
	private Long systemClass;
	//计算方式
	private String computeMethod;
	//历史数据所在表
	private String hisTable;
	//实时数据所在表
	private String curTable;
	//数据项更新频率
	private Long upTFrequency;
	//检测数据项别名
	private String dataItemAlias;
	//二级站点ID
	private Long stationId2s;
	//二级站点名称
	private String stationName2s;
	//三级站点ID
	private Long stationId3s;
	//三级站点名称
	private String stationName3s;
	//小数位数
	private Long decimalNum;
	//功能域
	private Long funcDomain;
	//标记是否收集历史数据
	private Long isGatherHis;
	//数据加载的ETL过程名称
	private String etlProcedure;
	//预处理后的实时数据表
	private String yclCurTable;
	//预处理后的历史数据表
	private String yclHisTable;
	//标记是否参与统计计算
	private Long isInvolve;
	
	
	/**
	 * @see 主鍵
	 */
	public Long getDataItemId() {
		return dataItemId;
	}
	/**
	 * @see 主鍵
	 */
	public void setDataItemId(Long dataItemId) {
		this.dataItemId = dataItemId;
	}
	/**
	 * @see 数据项名称
	 */
	public String getDataItemName() {
		return dataItemName;
	}
	/**
	 * @see 数据项名称
	 */
	public void setDataItemName(String dataItemName) {
		this.dataItemName = dataItemName;
	}
	/**
	 * @see 数据项类型ID
	 */
	public Long getDataItemTypeId() {
		return dataItemTypeId;
	}
	/**
	 * @see 数据项类型ID
	 */
	public void setDataItemTypeId(Long dataItemTypeId) {
		this.dataItemTypeId = dataItemTypeId;
	}
	/**
	 * @see 数据项大类ID
	 */
	public Long getDataItemPTypeId() {
		return dataItemPTypeId;
	}
	/**
	 * @see 数据项大类ID
	 */
	public void setDataItemPTypeId(Long dataItemPTypeId) {
		this.dataItemPTypeId = dataItemPTypeId;
	}
	/**
	 * @see 设备对象ID
	 */
	public Long getEquipmentId() {
		return equipmentId;
	}
	/**
	 * @see 设备对象ID
	 */
	public void setEquipmentId(Long equipmentId) {
		this.equipmentId = equipmentId;
	}
	/**
	 * @see 设备对象名称
	 */
	public String getEquipmentName() {
		return equipmentName;
	}
	/**
	 * @see 设备对象名称
	 */
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	/**
	 * @see 水源系统ID
	 */
	public Long getWsSysId() {
		return wsSysId;
	}
	/**
	 * @see 水源系统ID
	 */
	public void setWsSysId(Long wsSysId) {
		this.wsSysId = wsSysId;
	}
	/**
	 * @see 水源系统名称
	 */
	public String getWsSysName() {
		return wsSysName;
	}
	/**
	 * @see 水源系统名称
	 */
	public void setWsSysName(String wsSysName) {
		this.wsSysName = wsSysName;
	}
	/**
	 * @see 所属站点ID
	 */
	public Long getStationId() {
		return stationId;
	}
	/**
	 * @see 所属站点ID
	 */
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	/**
	 * @see 所属管线ID
	 */
	public Long getPipeId() {
		return pipeId;
	}
	/**
	 * @see 所属管线ID
	 */
	public void setPipeId(Long pipeId) {
		this.pipeId = pipeId;
	}
	/**
	 * @see 数据单位
	 */
	public String getDataUnit() {
		return dataUnit;
	}
	/**
	 * @see 数据单位
	 */
	public void setDataUnit(String dataUnit) {
		this.dataUnit = dataUnit;
	}
	/**
	 * @see 报警上限
	 */
	public Long getAlarmUpper() {
		return alarmUpper;
	}
	/**
	 * @see 报警上限
	 */
	public void setAlarmUpper(Long alarmUpper) {
		this.alarmUpper = alarmUpper;
	}
	/**
	 * @see 报警下限
	 */
	public Long getAlarmLower() {
		return alarmLower;
	}
	/**
	 * @see 报警下限
	 */
	public void setAlarmLower(Long alarmLower) {
		this.alarmLower = alarmLower;
	}
	/**
	 * @see 源头SCADA系统ID
	 */
	public Long getScadaId() {
		return scadaId;
	}
	/**
	 * @see 源头SCADA系统ID
	 */
	public void setScadaId(Long scadaId) {
		this.scadaId = scadaId;
	}
	/**
	 * @see 源头SCADA系统SYSID
	 */
	public String getSysIdAll() {
		return sysIdAll;
	}
	/**
	 * @see 源头SCADA系统SYSID
	 */
	public void setSysIdAll(String sysIdAll) {
		this.sysIdAll = sysIdAll;
	}
	/**
	 * @see 来源表ID
	 */ 
	public Long getSrcTableId() {
		return srcTableId;
	}
	/**
	 * @see 来源表ID
	 */
	public void setSrcTableId(Long srcTableId) {
		this.srcTableId = srcTableId;
	}
	/**
	 * @see 备注
	 */ 
	public String getRemark() {
		return remark;
	}
	/**
	 * @see 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @see 删除标记
	 */
	public Integer getDf() {
		return df;
	}
	/**
	 * @see 删除标记
	 */
	public void setDf(Integer df) {
		this.df = df;
	}
	/**
	 * @see 排序
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * @see 排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * @see 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @see 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @see 修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @see 修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @see 备用字段1
	 */
	public String getDef1() {
		return def1;
	}
	/**
	 * @see 备用字段1
	 */
	public void setDef1(String def1) {
		this.def1 = def1;
	}
	/**
	 * @see 备用字段2
	 */
	public String getDef2() {
		return def2;
	}
	/**
	 * @see 备用字段2
	 */
	public void setDef2(String def2) {
		this.def2 = def2;
	}
	/**
	 * @see 备用字段3
	 */
	public String getDef3() {
		return def3;
	}
	/** 
	 * @see 备用字段3
	 */
	public void setDef3(String def3) {
		this.def3 = def3;
	}
	/**
	 * @see SYSID
	 */
	public Long getSysId() {
		return sysId;
	}
	/**
	 * @see SYSID
	 */
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
	/**
	 * @see 计算类别
	 */
	public Long getComputeType() {
		return computeType;
	}
	/**
	 * @see 计算类别
	 */ 
	public void setComputeType(Long computeType) {
		this.computeType = computeType;
	}
	/**
	 * @see 原水清水系统分类
	 */
	public Long getSystemClass() {
		return systemClass;
	}
	/**
	 * @see 原水清水系统分类
	 */
	public void setSystemClass(Long systemClass) {
		this.systemClass = systemClass;
	}
	/**
	 * @see 计算方式
	 */
	public String getComputeMethod() {
		return computeMethod;
	}
	/**
	 * @see 计算方式
	 */
	public void setComputeMethod(String computeMethod) {
		this.computeMethod = computeMethod;
	}
	/**
	 * @see 历史数据所在表
	 */ 
	public String getHisTable() {
		return hisTable;
	}
	/**
	 * @see 历史数据所在表
	 */
	public void setHisTable(String hisTable) {
		this.hisTable = hisTable;
	}
	/**
	 * @see 实时数据所在表
	 */
	public String getCurTable() {
		return curTable;
	}
	/**
	 * @see 实时数据所在表
	 */
	public void setCurTable(String curTable) {
		this.curTable = curTable;
	}
	/**
	 * @see 数据项更新频率
	 */
	public Long getUpTFrequency() {
		return upTFrequency;
	}
	/**
	 * @see 数据项更新频率
	 */
	public void setUpTFrequency(Long upTFrequency) {
		this.upTFrequency = upTFrequency;
	}
	/**
	 * @see 检测数据项别名
	 */
	public String getDataItemAlias() {
		return dataItemAlias;
	}
	/**
	 * @see 检测数据项别名
	 */
	public void setDataItemAlias(String dataItemAlias) {
		this.dataItemAlias = dataItemAlias;
	}
	/**
	 * @see 二级站点ID
	 */
	public Long getStationId2s() {
		return stationId2s;
	}
	/**
	 * @see 二级站点ID
	 */
	public void setStationId2s(Long stationId2s) {
		this.stationId2s = stationId2s;
	}
	/**
	 * @see 二级站点名称
	 */
	public String getStationName2s() {
		return stationName2s;
	}
	/**
	 * @see 二级站点名称
	 */
	public void setStationName2s(String stationName2s) {
		this.stationName2s = stationName2s;
	}
	/**
	 * @see 三级站点ID
	 */
	public Long getStationId3s() {
		return stationId3s;
	}
	/**
	 * @see 三级站点ID
	 */
	public void setStationId3s(Long stationId3s) {
		this.stationId3s = stationId3s;
	}
	/**
	 * @see 三级站点名称
	 */
	public String getStationName3s() {
		return stationName3s;
	}
	/**
	 * @see 三级站点名称
	 */
	public void setStationName3s(String stationName3s) {
		this.stationName3s = stationName3s;
	}
	/**
	 * @see 小数位数
	 */
	public Long getDecimalNum() {
		return decimalNum;
	}
	/** 
	 * @see 小数位数
	 */
	public void setDecimalNum(Long decimalNum) {
		this.decimalNum = decimalNum;
	}
	/**
	 * @see 功能域
	 */
	public Long getFuncDomain() {
		return funcDomain;
	}
	/**
	 * @see 功能域
	 */
	public void setFuncDomain(Long funcDomain) {
		this.funcDomain = funcDomain;
	}
	/**
	 * @see 标记是否收集历史数据
	 */
	public Long getIsGatherHis() {
		return isGatherHis;
	}
	/**
	 * @see 标记是否收集历史数据
	 */
	public void setIsGatherHis(Long isGatherHis) {
		this.isGatherHis = isGatherHis;
	}
	/**
	 * @see 数据加载的ETL过程名称
	 */
	public String getEtlProcedure() {
		return etlProcedure;
	}
	/**
	 * @see 数据加载的ETL过程名称
	 */
	public void setEtlProcedure(String etlProcedure) {
		this.etlProcedure = etlProcedure;
	}
	/**
	 * @see 预处理后的实时数据表
	 */
	public String getYclCurTable() {
		return yclCurTable;
	}
	/**
	 * @see 预处理后的实时数据表
	 */
	public void setYclCurTable(String yclCurTable) {
		this.yclCurTable = yclCurTable;
	}
	/**
	 * @see 预处理后的历史数据表
	 */
	public String getYclHisTable() {
		return yclHisTable;
	}
	/**
	 * @see 预处理后的历史数据表
	 */
	public void setYclHisTable(String yclHisTable) {
		this.yclHisTable = yclHisTable;
	}
	/**
	 * @see 标记是否参与统计计算
	 */
	public Long getIsInvolve() {
		return isInvolve;
	}
	/**
	 * @see 标记是否参与统计计算
	 */
	public void setIsInvolve(Long isInvolve) {
		this.isInvolve = isInvolve;
	}

	@Override
	public String toString() {
		return "DataItemInfo [dataItemId=" + dataItemId + ", dataItemName="
				+ dataItemName + ", dataItemTypeId=" + dataItemTypeId
				+ ", dataItemPTypeId=" + dataItemPTypeId + ", equipmentId="
				+ equipmentId + ", equipmentName=" + equipmentName
				+ ", wsSysId=" + wsSysId + ", wsSysName=" + wsSysName
				+ ", stationId=" + stationId + ", pipeId=" + pipeId
				+ ", dataUnit=" + dataUnit + ", alarmUpper=" + alarmUpper
				+ ", alarmLower=" + alarmLower + ", scadaId=" + scadaId
				+ ", sysIdAll=" + sysIdAll + ", srcTableId=" + srcTableId
				+ ", remark=" + remark + ", df=" + df + ", sort=" + sort
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3
				+ ", sysId=" + sysId + ", computeType=" + computeType
				+ ", systemClass=" + systemClass + ", computeMethod="
				+ computeMethod + ", hisTable=" + hisTable + ", curTable="
				+ curTable + ", upTFrequency=" + upTFrequency
				+ ", dataItemAlias=" + dataItemAlias + ", stationId2s="
				+ stationId2s + ", stationName2s=" + stationName2s
				+ ", stationId3s=" + stationId3s + ", stationName3s="
				+ stationName3s + ", decimalNum=" + decimalNum
				+ ", funcDomain=" + funcDomain + ", isGatherHis=" + isGatherHis
				+ ", etlProcedure=" + etlProcedure + ", yclCurTable="
				+ yclCurTable + ", yclHisTable=" + yclHisTable + ", isInvolve="
				+ isInvolve + "]";
	}
	
}
