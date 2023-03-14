package units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int ammo;

    public Shooter(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed, int ammo,
            int pointX, int pointY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, pointX, pointY);
        this.ammo = ammo;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " " + state +
                " Ammo: " + ammo;
    }

    @Override
    public void step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die") || ammo == 0)
            return;
        BaseHero victim = foreign.get(findTheNearest(foreign));
        float damage = (victim.defense - attack) > 0 ? minDamage
                : (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        victim.getDamage(damage);
        for (BaseHero hero : ours) {
            if (hero.getClassHero().equals("Фермер") && hero.state.equals("Stand")) {
                hero.state = "Busy";
                break;
            }
        }
        ammo--;
    }
}