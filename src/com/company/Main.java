package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(50, "Boss", 500);
        System.out.println("Boss :" + boss.getProtection() + " " + "health:" + boss.getHeaith() + " " + "damag:" + boss.getDamag());

        Hero[] heroes=createHeroes();
        for (int i = 0; i < heroes.length ; i++) {
            System.out.println("Hero health: "+heroes[i].getGetHp()+" Hero Domage "+heroes[i].getGetDamag()+" Heroes Sposobnosti "+ heroes[i].getSuperSposobnost());
        }

    }

    public static Hero[] createHeroes(){
        Hero stiv=new Hero(100,30,"Physical");
        Hero maikl=new Hero(120,50," ");
        Hero kill=new Hero(110,20,"Kinetic");
        Hero[] heroes={stiv,maikl,kill};
        return heroes;

    }
}
