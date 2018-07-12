package com.ultra;

/**
 * @description:
 * @Author: ZhaoJP
 * @Date: 2018/6/15
 */
public class DemoImpl implements IDemo{
    @Override
    public String demo(String str) {
        return "Demo" + str;
    }
}
