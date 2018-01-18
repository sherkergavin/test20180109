Ext.define('gwj.view.monitor.wujiangDataView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.wujiangDataView',
    title:'吴江数据',
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
