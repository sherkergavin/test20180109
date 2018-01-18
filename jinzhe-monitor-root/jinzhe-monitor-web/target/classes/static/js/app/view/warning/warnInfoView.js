Ext.define('gwj.view.warning.warnInfoView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.warnInfoView',
    title:'预警信息查询',
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
