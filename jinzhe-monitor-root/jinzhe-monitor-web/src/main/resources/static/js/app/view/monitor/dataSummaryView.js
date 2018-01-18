Ext.define('gwj.view.monitor.dataSummaryView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.dataSummaryView',
    title:'数据总览',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            //src:('/aquarius/iframe3/design/designA.html')
            src:('/aquarius/u/hello')
            
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
