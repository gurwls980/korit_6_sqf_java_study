package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{    // extends: 공통사항을 묶음
    private String breed;

    public Dog() {
        super();    // Animal객체 생성자 호출 // 기본적으로 생략됨 // 무조건 제일 위에 존재
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override   // ctrl + o : 상속관계 생성
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
