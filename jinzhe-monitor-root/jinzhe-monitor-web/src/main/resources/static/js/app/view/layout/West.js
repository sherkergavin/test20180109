Ext.define('gwj.view.layout.West',{
			extend:'Ext.Panel',
			alias:'widget.westViewByGWJ',
			id:'westViewByGWJ',
			width:200,
			split:true, 
			collapsible:true, 
			layout: {
				animate: true,
				type: 'accordion',
				activeOnTop: false,
				titleCollapse: true
			},
			initComponent:function(){
				var me = this;
				Ext.applyIf(me,{
					region:'west',
					title:'信息管理部',
					items: []
				});
				me.callParent(arguments);
			}
		});