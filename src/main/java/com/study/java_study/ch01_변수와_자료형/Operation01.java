package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {

    public static void main(String[] args) {
        // 연산자

        // 산술 연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0;
        System.out.println(num4);

        System.out.println("/////////////////");
        System.out.println();

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        System.out.println("/////////////////");
        System.out.println();

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(!true && true);
        System.out.println(!(true && true));

        System.out.println("/////////////////");
        System.out.println();

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 == 1);
        System.out.println(1 != 1);

        System.out.println("/////////////////");
        System.out.println();

        // 조건연산자
        System.out.println(3 > 2 ? "참" : "거짓");
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수 입니다." :  "y의 배수가 아닙니다.";
        String result2 = "" + 10 / 2;
        System.out.println(result);

        System.out.println("/////////////////");
        System.out.println();

        // 복합대입연산자
        int number = 10;
        number += 5;
        number -= 1;
        number *= 2;
        number /= 2;
        System.out.println(number);
        number %= 2;
        System.out.println(number);

        System.out.println("/////////////////");
        System.out.println();

        boolean a = 2 <= 1; // 거짓
        boolean b = 2 == 0; // 거짓
        boolean c = 2 <= 3; // 참
        System.out.println(a && b);
        System.out.println(a || b || c);

    }

}





