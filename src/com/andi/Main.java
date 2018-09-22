package com.andi;

public class Main {

    public static void main(String[] args) {

        Person bonni = new Person("Bonni", 10);
        System.out.println(bonni);

        // casting: because the return typ is just a Prototype
        Person nina = (Person) bonni.clone();
        System.out.println(nina);

        Dolphin jerry = new Dolphin("jerry", 78);
        System.out.println(jerry);
        Dolphin sam = (Dolphin) jerry.clone();
        System.out.println(sam);
    }
}
