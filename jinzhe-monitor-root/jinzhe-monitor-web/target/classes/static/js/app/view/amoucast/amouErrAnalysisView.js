Ext.define('gwj.view.amoucast.amouErrAnalysisView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.amouErrAnalysisView',
    title:'水量误差分析',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/de/developA.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
