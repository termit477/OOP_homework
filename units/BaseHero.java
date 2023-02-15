package units;

import java.util.Random;

public abstract class BaseHero implements GameInterfase{

    protected String name;
    protected int hp, maxHp, attack, def;

    public BaseHero(String name, int hp, int def) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.def = def;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "null";
    }

}
