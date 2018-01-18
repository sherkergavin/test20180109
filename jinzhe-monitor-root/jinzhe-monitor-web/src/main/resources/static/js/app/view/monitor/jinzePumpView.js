Ext.define('gwj.view.monitor.jinzePumpView', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.jinzePumpView',
    title:'金泽泵站',
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
