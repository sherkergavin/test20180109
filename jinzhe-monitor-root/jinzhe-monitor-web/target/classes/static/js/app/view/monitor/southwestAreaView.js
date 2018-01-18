Ext.define('gwj.view.monitor.southwestAreaView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.southwestAreaView',
    title:'西南五区',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/design/designD.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
