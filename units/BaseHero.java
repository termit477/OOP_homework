package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterfase {

    protected String name;
    protected int defense, minDamage, maxDamage, hp, maxHp, speed;
    protected Point pointXY;

    public BaseHero(String name, int defense, int minDamage, int maxDamage, int hp, int speed, Point pointXY) {
        this.name = name;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.pointXY = pointXY;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public void setHP(int hp){
        this.hp -= hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getInfoForQueue() {
        return "";
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    }

    @Override
    public String getInfo() {
        return "null";
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public void giveDamage(BaseHero target){
        int damage = (this.maxDamage + this.minDamage)/2;
        target.setHP(damage - target.defense);
    }
}
