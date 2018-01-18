Ext.define('gwj.view.warning.algaeWarnView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.algaeWarnView',
    title:'藻类预警监控',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
           	src:('iframe/design/designB.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
