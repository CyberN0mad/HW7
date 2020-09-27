package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int heroHealth;
    private int heroDamage;
    private String heroDefencetype;

    public Hero(int heroHealth, int heroDamage, String heroDefencetype) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroDefencetype = heroDefencetype;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroDefencetype() {
        return heroDefencetype;
    }

    public void setHeroDefencetype(String heroDefencetype) {
        this.heroDefencetype = heroDefencetype;
    }
}
