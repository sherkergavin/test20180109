Ext.define('gwj.view.monitor.songpuBridgeView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.songpuBridgeView',
    title:'松浦大桥',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/design/designC.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
