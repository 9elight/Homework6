package com.company;

public class Warrior extends Player implements SuperAbility {
    private int superDamage;

    public int getSuperDamage() {
        return superDamage;
    }

    public void setSuperDamage(int superDamage) {
        this.superDamage = superDamage;
    }


    @Override
    public String superPower() {
        String s1 = "Разрез";
        return s1;
    }
}
