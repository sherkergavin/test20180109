Ext.define('gwj.controller.monitor.monitorController',{
	extend:'Ext.app.Controller',
	alias:'widget.monitorControllerByGWJ',
	id:'monitorControllerByGWJ',
	models:[],
	stores:[],
	views:[
			'monitor.dataSummaryView',
			'monitor.jinzeDamView',
			'monitor.jinzePumpView',
			'monitor.wujiangDataView',
			'monitor.taipuzaDataView',
			'monitor.southwestAreaView',
			'monitor.songpuBridgeView'
		  ],
	init:function(){
		var me = this;
	
	
	}
});