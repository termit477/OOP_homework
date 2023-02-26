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
    public void step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die") || mana <= 0)
            return;
        BaseHero victim = findTheMostWounded(ours);
        victim.getDamage(minDamage);
        mana--;

        if (mana <= 0)
            mana += 5;
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
