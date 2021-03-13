package com;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(500,50,new Weapon("Sword ","Katana"));

        System.out.println("Boss damage:" + boss.getDamage() + "\nBoss health:" + boss.getHealth() + "\n"
        + boss.getWeapon().info());
    }
}
