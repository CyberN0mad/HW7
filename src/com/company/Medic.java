package com.company;

public class Medic extends Hero {


    public Medic(int heroHealth, int heroDamage, String heroDefencetype) {
        super(heroHealth, heroDamage, heroDefencetype);
    }

    @Override
    public void superAbilityType() {
        System.out.println("Medic heal:   " + getHeroDefencetype());
    }
}
