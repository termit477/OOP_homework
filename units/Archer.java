package units;

import java.util.ArrayList;

public abstract class Archer extends BaseHero {

    protected int ammo;

    public Archer(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed, int ammo,
            int pointX, int pointY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, pointX, pointY);
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die") || (ammo == 0)) return;
        BaseHero victim = foreign.get(findTheNearest(foreign));
        float damage = (victim.defense - attack) > 0 ? minDamage
                : (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        for (BaseHero hero : ours) {
            if (hero.getInfo().split(" ")[0].equals("Крестьянин") && hero.state.equals("Stand"));
            hero.state = "Busy";
            return;
        }
        ammo--;
    }
}