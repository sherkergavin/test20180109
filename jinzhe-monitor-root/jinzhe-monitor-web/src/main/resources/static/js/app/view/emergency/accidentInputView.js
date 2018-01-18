Ext.define('gwj.view.emergency.accidentInputView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.accidentInputView',
    title:'污染事件录入',
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
