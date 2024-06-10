package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        Predicate<Integer> even = num -> num % 2 == 0;
        System.out.println(even.test(9));

        Runnable run = () -> System.out.println("fals");
        run.run();

        Function<String, Integer> fun = s -> Integer.parseInt(s);
        Integer num = fun.apply("9");
        System.out.println(num);

        Consumer<String> con = s -> System.out.println(s + " = 구");
        con.accept("9");

        Supplier<Integer> sup = () ->{
            Integer result = num + 9;
            return result;
        };
        System.out.println(sup.get());

    }
}
