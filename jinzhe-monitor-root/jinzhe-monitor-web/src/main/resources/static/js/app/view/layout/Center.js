Ext.define('gwj.view.layout.Center',{
		extend:'Ext.tab.Panel',
		alias:'widget.centerViewByGWJ',
		id:'centerViewByGWJ',
		loadPage:function(url,id,title){
			var tab = this.getComponent(id); 
			if(tab){
				this.setActiveTab(tab);
			}else{
				var p = this.add(Ext.create(url,{
					id : id,
					title : title,
					closable :true,
					closeAction :'destroy'
				}));
				this.setActiveTab(p);
			}
		},
		initComponent: function(){
			var me = this;
			Ext.applyIf(me,{
				id:'gwjCenter123',
				region:'center',
                items : [{title :'首页',
                          html:'<img  src='+projectGP('/pic/water.jpg')+'/>'
                        }]  

			});
			me.callParent(arguments);
		}
		});