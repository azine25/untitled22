package com;


public class Boss extends GameEntity {

    Weapon weapon ;

    public Boss(int health, int damege, Weapon weapon) {
        super(health, damege);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}




