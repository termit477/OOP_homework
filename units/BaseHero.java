package units;

import java.util.Random;

public abstract class BaseHero implements GameInterfase {

    protected String name;
    protected int defense, minDamage, maxDamage, hp, maxHp, speed;

    public BaseHero(String name, int defense, int minDamage, int maxDamage, int hp, int speed) {
        this.name = name;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }
    
    public String getInfoForQueue() {
        return "";
    }

    @Override
    public void step() {
    }
    
    @Override
    public String getInfo() {
        return "null";
    }
    
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

}
