package units;

import java.util.ArrayList;

public class Mag extends BaseHero {

    protected int mana;

    public Mag(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed, int mana,
            int pointX,
            int pointY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, pointX, pointY);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return state + " " +
                getClassHero() + " " +
                name +
                " Hp:" + Math.round(hp) +
                " Def:" + defense +
                " Att:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coords:" + pointXY.x + "." + pointXY.y +
                " Mana:" + mana;
    }
            
            
    @Override
    public boolean step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die"))
            return false;
        if (mana > 0) {
            BaseHero victim = findTheMostWounded(ours);
            victim.getDamage(minDamage);
            mana--;
        }
        return true;
    }

    protected BaseHero findTheMostWounded(ArrayList<BaseHero> ours) {
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < ours.size(); i++) {
            BaseHero character = ours.get(i);
            if (minHp > character.maxHp - character.hp) {
                index = i;
                minHp = character.maxHp - character.hp;
            }
        }
        return ours.get(index);
    }
}
