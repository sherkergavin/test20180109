Ext.define('gwj.view.manual.detectDataQueryView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.detectDataQueryView',
    title:'检测数据查询',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/safeguard/safeguardC.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
