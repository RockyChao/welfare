package com.u91porn.ui.proxy;

/**
 * @author flymegoc
 * @date 2018/1/20
 */

public interface IProxy extends IBaseProxy {
    void testProxy(String proxyIpAddress,int proxyPort);
    void parseGouBanJia(boolean pullToRefresh);
}
