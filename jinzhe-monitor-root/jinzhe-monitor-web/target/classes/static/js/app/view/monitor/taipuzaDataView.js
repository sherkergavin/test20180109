Ext.define('gwj.view.monitor.taipuzaDataView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.taipuzaDataView',
    title:'太浦闸数据',
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
