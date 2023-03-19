package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterfase {

    protected String name, state;
    protected int attack, defense, minDamage, maxDamage, hp, maxHp, speed;
    protected Point pointXY;

    public BaseHero(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed, int pointX,
            int pointY) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.minDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        pointXY = new Point(pointX, pointY);
        state = "Stand";
    }

    public String toString() {
        return state + " " +
                getClassHero() + " " +
                name +
                " Hp:" + Math.round(hp) +
                " Def:" + defense +
                " Att:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coords:" + pointXY.x + "." + pointXY.y;
    }

    public int getHp() {return hp;}

    public int getSpeed() {return speed;}

    public String getClassHero() {return "null";}

    @Override
    public boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        return true;
    }

    @Override
    public String getInfo() {return "null";}

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int[] getCoords() {
        return new int[] { pointXY.getPointX(), pointXY.getPointY() };
    }

    public void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp)
            hp = maxHp;
    }

    protected int findTheNearest(ArrayList<BaseHero> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > pointXY.getDistance(team.get(i).pointXY) && !team.get(i).state.equals("Die")) {
                index = i;
                min = pointXY.getDistance(team.get(i).pointXY);
            }
        }
        return index;
    }
}