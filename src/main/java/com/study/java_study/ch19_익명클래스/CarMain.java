package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("K8", "화이트");
        System.out.println(kiaCar);

        AbstractCar abstractCar = new AbstractCar("내가만든자동차", "블랙") {
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄.");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        };

    }
}
