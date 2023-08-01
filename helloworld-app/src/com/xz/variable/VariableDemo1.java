package com.xz.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 目标：认识变量，掌握使用变量的好处，变量的特点，应用场景
        // 1、定义一个整型变量，记住一个整数
        // 数据类型 变量名 = 数据
        // 注意：“=”在Java中是赋值的意识，从右往左看

        int age = 23;
        System.out.println(age);

        // 2、记住一个人的成绩
        double score = 99.5;
        System.out.println(score);

        System.out.println("----------------");

        // 3、使用变量的好处：便于扩展和维护
        int number = 888;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println("----------------");

        // 4、变量的特点：里面装的数据可以被替换
        int age2 = 18;
        System.out.println(age2);
        age2 = 19;
        System.out.println(age2);
        age2 = age2 + 1;
        System.out.println(age2);

        System.out.println("----------------");

        // 5、需求：钱包有9.5元，收到了10元红包，又发出了5元红包，请输出各阶段红包情况
        double money = 9.5;
        System.out.println(money);
        money = money + 10;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
    }
}
