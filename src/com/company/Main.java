package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(500, 50, " ATTACKING ");
        Medic medic = new Medic(300,0, " HEALING ");
        Magic magic = new Magic(200,100," SHOOTING ");

        HavingSuperAbility[] heroes = {warrior,medic, magic};
        for (HavingSuperAbility r: heroes) {
            r.superAbilityType();
        }
        


    }

    public static void hit(HavingSuperAbility hit){
        hit.superAbilityType();
    }


}
