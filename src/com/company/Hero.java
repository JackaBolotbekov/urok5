package com.company;

public class Hero {
    private int getHp;
    private int getDamag;
    private String superSposobnost;

    public Hero(int getHp, int getDamag, String superSposobnost) {
        this.getHp = getHp;
        this.getDamag = getDamag;
        this.superSposobnost = superSposobnost;
    }
    public Hero(String superSposobnost,int getDamag){
        this.superSposobnost = superSposobnost;
        this.getDamag = getDamag;
    }

    public int getGetHp() {
        return getHp;
    }

    public int getGetDamag() {
        return getDamag;
    }

    public String getSuperSposobnost() {
        return superSposobnost;
    }
}
