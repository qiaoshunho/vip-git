package com.ultra;

/**
 * @description:
 * @Author: ZhaoJP
 * @Date: 2018/7/3
 */
class SubClass extends SuperClass
{
    //public String name = "SubClass";
}

class SuperClass
{
    public String name = "SuperClass";
}

public class CodeBlockDemo {


    //运行后输出结果?
    public static void main(String[] args)
    {
        SuperClass clz = new SubClass();
        //你觉得这里输出什么?
        System.out.println(clz.name);
    }

}
