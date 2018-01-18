Ext.define('gwj.view.monitor.jinzeDamView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.jinzeDamView',
    title:'金泽水库',
    initComponent: function () {
        var me = this;
        var iframe = Ext.create('Ext.ux.IFrame', {
            align:'center',
            frameName: 'Iframe',
           	src:('iframe/design/designB.html')
        });
        Ext.apply(this, {
            layout: 'fit',
          	items:iframe
        });
        me.callParent(arguments);
    }
});
