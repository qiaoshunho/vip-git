package com.ultra;

/**
 * @description:
 * @Author: ZhaoJP
 * @Date: 2018/6/14
 */
public class HelloImpl implements IHello{
    @Override
    public String say(String str) {
        return "我的第一个dubbo项目" + str;
    }
}
