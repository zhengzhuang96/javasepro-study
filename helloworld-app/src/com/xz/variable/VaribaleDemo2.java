package com.xz.variable;

public class VaribaleDemo2 {
    public static void main(String[] args) {
        // 目标：搞清楚使用变量的几点注意事项
        // 1、变量要先声明才能使用
        int age = 18;
        System.out.println(age);

        // 2、变量是什么类型，就应该用来装什么类型的数据，否则报错
        double age2 = 9.8;

        // 3、变量是从定义开始到“}”截止的范围内有效；且同一个范围内，定义的多个变量，他们的名称不能一样
        {
            int a = 19;
            // int a = 23; // 同一个范围内已声明不能重复声明
            System.out.println(a);
        }
        // System.out.println(a);

        // 4、变量定义的时候可以不赋值初始值；但在使用是，变量必许有值，否则报错
        int number; // 定义不需要初始值
        // System.out.println(number); // 使用时必许给初始值
    }
}
