package org.jinzhe.monitor.web.controller.index;

import java.util.ArrayList;
import java.util.List;



import org.jinzhe.monitor.entity.json.AjaxData;
import org.jinzhe.monitor.entity.menu.Menu;
//import org.jinzhe.monitor.web.po.json.AjaxData;
//import org.jinzhe.monitor.web.po.menu.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
* @ClassName: IndexController 
* @Description: indexController
* @author GWJ
* @date 2017年11月3日 下午3:15:39 
*
 */
@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String welcomeIndex(){
			
		return "index";
	}
	

	@ResponseBody
	@RequestMapping(value="/lg/menu")
	public AjaxData<List<Menu>> getMenu(){

		List<Menu> mList = new ArrayList<Menu>();
		
		List<Menu> cildList0 = new ArrayList<Menu>();
		
		Menu cild41 = new Menu();
		cild41.setId(611);
		cild41.setText("数据总览");//datamonitor
		cild41.setLeaf(true);
		cild41.setExpanded(false);
		cild41.setHrefTarget("gwj.view.monitor.dataSummaryView");
		cildList0.add(cild41);
		
		Menu cild42 = new Menu();
		cild42.setId(612);
		cild42.setText("金泽水库");
		cild42.setLeaf(true);
		cild42.setExpanded(false);
		cild42.setHrefTarget("gwj.view.monitor.jinzeDamView");
		cildList0.add(cild42);
		
		Menu cild43 = new Menu();
		cild43.setId(613);
		cild43.setText("金泽泵站");
		cild43.setLeaf(true);
		cild43.setExpanded(false);
		cild43.setHrefTarget("gwj.view.monitor.jinzePumpView");
		cildList0.add(cild43);
		
		Menu cild44 = new Menu();
		cild44.setId(614);
		cild44.setText("吴江数据");
		cild44.setLeaf(true);
		cild44.setExpanded(false);
		cild44.setHrefTarget("gwj.view.monitor.wujiangDataView");
		cildList0.add(cild44);
		
		Menu cild45 = new Menu();
		cild45.setId(615);
		cild45.setText("太浦闸数据");
		cild45.setLeaf(true);
		cild45.setExpanded(false);
		cild45.setHrefTarget("gwj.view.monitor.taipuzaDataView");
		cildList0.add(cild45);
		
		Menu cild46 = new Menu();
		cild46.setId(616);
		cild46.setText("松浦大桥");
		cild46.setLeaf(true);
		cild46.setExpanded(false);
		cild46.setHrefTarget("gwj.view.monitor.songpuBridgeView");
		cildList0.add(cild46);
		
		Menu cild47 = new Menu();
		cild47.setId(617);
		cild47.setText("西南五区");
		cild47.setLeaf(true);
		cild47.setExpanded(false);
		cild47.setHrefTarget("gwj.view.monitor.southwestAreaView");
		cildList0.add(cild47);
		
		
		
		Menu m0 = new Menu();
		
		m0.setId(610);
		m0.setText("数据监控");
		m0.setLeaf(false);
		m0.setExpanded(true);
		m0.setChildren(cildList0);
		mList.add(m0);
		
	/////////////////////////////////////////////////////////////	
		
		List<Menu> cildList1 = new ArrayList<Menu>();
		
		Menu cild01 = new Menu();
		cild01.setId(711);
		cild01.setText("藻类预警监控");
		cild01.setLeaf(true);
		cild01.setExpanded(false);
		cild01.setHrefTarget("gwj.view.warning.algaeWarnView");
		cildList1.add(cild01);
		
		Menu cild02 = new Menu();
		cild02.setId(712);
		cild02.setText("预警信息查询");
		cild02.setLeaf(true);
		cild02.setExpanded(false);
		cild02.setHrefTarget("gwj.view.warning.warnInfoView");
		cildList1.add(cild02);
		
		Menu m1 = new Menu();
		
		m1.setId(710);
		m1.setText("藻类预警");
		m1.setLeaf(false);
		m1.setExpanded(true);
		m1.setChildren(cildList1);
		mList.add(m1);
		
	/////////////////////////////////////////////////////////////////////////
		
		List<Menu> cildList2 = new ArrayList<Menu>();
		
		Menu cild11 = new Menu();
		cild11.setId(811);
		cild11.setText("污染事件录入");
		cild11.setLeaf(true);
		cild11.setExpanded(false);
		cild11.setHrefTarget("gwj.view.emergency.accidentInputView");
		cildList2.add(cild11);
		
		Menu cild12 = new Menu();
		cild12.setId(812);
		cild12.setText("污染事件历史查询");
		cild12.setLeaf(true);
		cild12.setExpanded(false);
		cild12.setHrefTarget("gwj.view.emergency.accidentQueryView");
		cildList2.add(cild12);
		
		Menu m2 = new Menu();
		
		m2.setId(810);
		m2.setText("突发污染物事件");
		m2.setLeaf(false);
		m2.setExpanded(true);
		m2.setChildren(cildList2);
		mList.add(m2);
		
		////////////////////////////////////////////////////////////////////////
		
		List<Menu> cildList3 = new ArrayList<Menu>();
		
		
		Menu cild21 = new Menu();
		cild21.setId(911);
		cild21.setText("水量误差分析");
		cild21.setLeaf(true);
		cild21.setExpanded(false);
		cild21.setHrefTarget("gwj.view.amoucast.amouErrAnalysisView");
		cildList3.add(cild21);
		
	
		Menu m3 = new Menu();
		
		m3.setId(910);
		m3.setText("水量预测");
		m3.setLeaf(false);
		m3.setExpanded(true);
		m3.setChildren(cildList3);
		mList.add(m3);

		/////////////////////////////////////////////////////////////////
		
		List<Menu> cildList4 = new ArrayList<Menu>();
		
		
		Menu cild31 = new Menu();
		cild31.setId(1011);
		cild31.setText("水质误差分析");
		cild31.setLeaf(true);
		cild31.setExpanded(false);
		cild31.setHrefTarget("gwj.view.qualcast.qualErrAnalysisView");
		cildList4.add(cild31);
		
	
		Menu m4 = new Menu();
		
		m4.setId(1010);
		m4.setText("水质预测");
		m4.setLeaf(false);
		m4.setExpanded(true);
		m4.setChildren(cildList4);
		mList.add(m4);
		
		///////////////////////////////////////////////////////////////////
		
		
		List<Menu> cildList5 = new ArrayList<Menu>();
		
		
		Menu cild51 = new Menu();
		cild51.setId(1111);
		cild51.setText("数据统计");
		cild51.setLeaf(true);
		cild51.setExpanded(false);
		cild51.setHrefTarget("gwj.view.statistics.dataStatisticsView");
		cildList5.add(cild51);
		
	
		Menu m5 = new Menu();
		
		m5.setId(1110);
		m5.setText("统计分析");
		m5.setLeaf(false);
		m5.setExpanded(true);
		m5.setChildren(cildList5);
		mList.add(m5);
		
		////////////////////////////////////////////////////////////////////
		
		List<Menu> cildList6 = new ArrayList<Menu>();
		
		
		Menu cild61 = new Menu();
		cild61.setId(1211);
		cild61.setText("检测数据查询");
		cild61.setLeaf(true);
		cild61.setExpanded(false);
		cild61.setHrefTarget("gwj.view.manual.detectDataQueryView");
		cildList6.add(cild61);
		
		
		Menu cild62 = new Menu();
		cild62.setId(1212);
		cild62.setText("检测数据录入");
		cild62.setLeaf(true);
		cild62.setExpanded(false);
		cild62.setHrefTarget("gwj.view.manual.detectDataInputView");
		cildList6.add(cild62);
		
	
		Menu m6 = new Menu();
		
		m6.setId(1210);
		m6.setText("人工检测数据");
		m6.setLeaf(false);
		m6.setExpanded(true);
		m6.setChildren(cildList6);
		mList.add(m6);
		
		
		
		
		
		AjaxData<List<Menu>> ajaxData = new AjaxData<List<Menu>>();
		
		ajaxData.setSuccess(true);
		ajaxData.setData(mList);	
		
		return ajaxData;
	
	}
}
