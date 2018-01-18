Ext.define('gwj.view.layout.South',{
		extend:'Ext.Panel',
		id:'southViewByGWJ',
		alias:'widget.southViewByGWJ',
		frame:true,
		initComponent:function(){
			var me = this;
			Ext.applyIf(me,{
				region:'south',
				baseCls : 'x-plain',
				height : 50,
				collapseMode : 'mini',
				html : '<p align="center"> aquarius 2017 GWJ\'s App Co.,Ltd.</p>'
			});
			me.callParent(arguments);
		}
	});