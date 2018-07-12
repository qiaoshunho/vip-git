package com.ultra;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.container.Main;
import com.alibaba.dubbo.rpc.Protocol;

import java.security.cert.Extension;

/**
 * @description:
 * @Author: ZhaoJP
 * @Date: 2018/6/14
 */
public class Bootstrap {
    public static void main(String[] args) {
       // Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        Main.main(new String[]{"spring","log4j"});
    }
}
