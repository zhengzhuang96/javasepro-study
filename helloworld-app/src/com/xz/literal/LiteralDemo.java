package com.xz.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 目标：账务常见数据在程序中的书写格式

        // 1、整数
        System.out.println(666);

        // 2、小数
        System.out.println(99.5);

        // 3、字符：必许要用单引号围起来，有且只能有一个字符
        System.out.println('a');
        System.out.println('0');
        System.out.println('中');
        // System.out.println('中国'); .// 有问题
        System.out.println(' '); // 空字符
        // System.out.println(''); // 不能不填写

        // 特殊字符：\n 代表换行 \t 代表一个tab
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        // 4、字符串：必许用双引号围起来，里面的内容随意
        System.out.println("测试多字符");
        System.out.println("  ");
        System.out.println("1");

        // 5、布尔值：只有2个值 true false
        System.out.println(true);
        System.out.println(false);

    }
}
