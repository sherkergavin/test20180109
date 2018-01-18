package test.jinzhe.monitor.earlywarning;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jinzhe.monitor.earlywarning.WarningApp;
import org.jinzhe.monitor.earlywarning.mapper.unknow.StationInfoMapper;
import org.jinzhe.monitor.entity.station.StationInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
* @ClassName: WarningTest 
* @Description: junit
* @author GWJ
* @date 2017年12月5日 下午1:20:02 
*
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=WarningApp.class)
public class WarningTest {

	@Autowired
	private StationInfoMapper stationInfoMapper;
	

//	@Qualifier("sqlKnowSessionTemplate")
//	public void setOriginalDataMapper(SqlSession sqlSession) {
//        this.stationInfoMapper = sqlSession.getMapper(StationInfoMapper.class);
//    }
	
	
	
	@Test
	public void stationInfoQueryDataTest(){
		
		 List<StationInfo> list = stationInfoMapper.queryData();
		
		 for(StationInfo info:list){
			 
			 System.out.println(info.toString());
			 
		 }
		
	}



}
