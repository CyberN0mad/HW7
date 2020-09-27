package com.company;

public class Warrior extends Hero{


    public Warrior(int heroHealth, int heroDamage, String heroDefencetype) {
        super(heroHealth, heroDamage, heroDefencetype);
    }

    @Override
    public void superAbilityType() {
        System.out.println("Warrior hit:   " + getHeroDefencetype());
    }
}
