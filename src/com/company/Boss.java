package com.company;

public class Boss {
    private int damag;
    private String protection;
    private int Heaith;

    public int getDamag() {
        return damag;
    }

    public void setDamag(int damag) {
        this.damag = damag;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }
    public  int getHeaith(){
        return Heaith;
    }
    public void setHeaith(int heaith) {
        this.Heaith = heaith;
    }

    public void setHeaith() {
        this.Heaith = Heaith;
    }

    public Boss(int damag, String protection, int Heaith) {
        this.damag = damag;
        this.protection = protection;
        this.Heaith = Heaith;
    }


}

