Ext.define('gwj.view.qualcast.qualErrAnalysisView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.qualErrAnalysisView',
    title:'水质误差分析',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/detection/detectionA.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
