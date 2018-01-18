package org.jinzhe.monitor.schedule.service;

import java.util.List;

import javax.annotation.Resource;

import org.jinzhe.monitor.entity.data.OriginalData;
import org.jinzhe.monitor.schedule.mapper.current.CurrentDataMapper;
import org.jinzhe.monitor.schedule.mapper.current.HistoryDataMapper;
import org.jinzhe.monitor.schedule.mapper.current.OriginalDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.ibatis.session.SqlSession;
/**
 * 
* @ClassName: ProcessData 
* @Description: service
* @author GWJ
* @date 2017年11月24日 下午4:17:41 
*
 */
@Service
public class ProcessDataService{
	
	private CurrentDataMapper currentDataMapper;

	private HistoryDataMapper historyDataMapper;
	
	private OriginalDataMapper originalDataMapper;

	
	@Autowired
	@Qualifier("sqlSqlServerSessionTemplate")
	public void setOriginalDataMapper(SqlSession sqlSession) {
        this.originalDataMapper = sqlSession.getMapper(OriginalDataMapper.class);
    }
		
	@Resource(name="sqlOracleSessionTemplate")
	public void setCurrentDataMapper(SqlSession sqlSession) {
        this.currentDataMapper = sqlSession.getMapper(CurrentDataMapper.class);
    }
	
	@Resource(name="sqlOracleSessionTemplate")
	public void setHistoryDataMapper(SqlSession sqlSession) {
		this.historyDataMapper = sqlSession.getMapper(HistoryDataMapper.class);
	}

	
	public void updateOriginalData(List<OriginalData> list){
		
		
		
		currentDataMapper.updCurrentData(list);
	}
	
	
	
	
	public List<OriginalData> readOriginalData(){
		
		List<OriginalData> list = originalDataMapper.queryOriginalData();

		return list;
	}
	
	@Transactional(transactionManager="confOracleTransactionManager")
	public void writeOriginalData(List<OriginalData> list){
				
		currentDataMapper.updCurrentData(list);
		
		List<OriginalData> proceslist = currentDataMapper.queryCurrentData();
		
		historyDataMapper.putHistoryData(proceslist);

	}
	
	
	
}
