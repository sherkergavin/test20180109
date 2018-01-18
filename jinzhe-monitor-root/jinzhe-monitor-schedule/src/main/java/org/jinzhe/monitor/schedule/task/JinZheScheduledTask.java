package org.jinzhe.monitor.schedule.task;

import java.util.List;

import org.jinzhe.monitor.entity.data.OriginalData;
import org.jinzhe.monitor.schedule.service.ProcessDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * 
* @ClassName: JinZheScheduledTask 
* @Description: Task
* @author GWJ
* @date 2017年11月27日 下午4:47:00 
*
 */

@Configuration
public class JinZheScheduledTask {

	 private static Logger logger =LoggerFactory.getLogger(JinZheScheduledTask.class);
	
	@Autowired
	private ProcessDataService processDataService;
	

	
	@Scheduled(cron = "*/5 * * * * ?")
    public void readHuaCunData() throws InterruptedException {
       
		System.out.println("---------读华存的数据-------------");
       
	}
	
	@Scheduled(cron = "*/20 * * * * ?")
    public void readOriginalData() throws InterruptedException {
       
		logger.info("每分钟读取一次 数据,开始...");
        List<OriginalData> list = processDataService.readOriginalData();
        for(OriginalData dd:list){
        	
        	System.out.println(dd.toString());
        }
        
        logger.info("批量入库,开始...");
        processDataService.writeOriginalData(list);
        //processDataService.updateOriginalData(list);
        
        logger.info("定时任务完成,开始...");

	}

}
