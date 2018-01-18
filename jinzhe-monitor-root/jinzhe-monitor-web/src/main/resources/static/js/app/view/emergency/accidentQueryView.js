Ext.define('gwj.view.emergency.accidentQueryView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.accidentQueryView',
    title:'污染事件历史查询',
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
