package com.study.java_study.ch19_익명클래스;

public class  AttackKey implements Key {
    @Override
    public void onKeyUp() {
        System.out.println("공격키 뗌");
    }

    @Override
    public void onKeyDown() {
        System.out.println("공격키 누름");
    }
}
