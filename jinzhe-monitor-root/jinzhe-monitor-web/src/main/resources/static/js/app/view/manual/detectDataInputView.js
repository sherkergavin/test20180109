Ext.define('gwj.view.manual.detectDataInputView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.detectDataInputView',
    title:'检测数据录入',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
            src:('iframe/safeguard/safeguardB.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
