package com.company;

public class Magic extends Hero{


    public Magic(int heroHealth, int heroDamage, String heroDefencetype) {
        super(heroHealth, heroDamage, heroDefencetype);
    }

    @Override
    public void superAbilityType() {
        System.out.println("Magic cast:   " + getHeroDefencetype());
    }



}