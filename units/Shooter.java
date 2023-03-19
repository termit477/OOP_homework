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
        return state + " " +
                getClassHero() + " " +
                name +
                " Hp:" + Math.round(hp) +
                " Def:" + defense +
                " Att:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coords:" + pointXY.x + "." + pointXY.y +
                " Ammo: " + ammo;
    }

    @Override
    public boolean step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die"))
            return false;
        if (ammo > 0) {
            BaseHero victim = foreign.get(findTheNearest(foreign));
            float damage = 0;
            if (victim.defense - attack > 0)
                damage = minDamage;
            else if (victim.defense - attack < 0)
                damage = maxDamage;
            else
                damage = (minDamage + maxDamage) / 2;
            victim.getDamage(damage);
            for (BaseHero hero : ours) {
                if (hero.getClassHero().equals("Фермер") && !hero.state.equals("Die")){
                    hero.state = "Busy";
                    ammo++;
                    break;
                }
            }
            ammo--;
        }
        return true;
    }
}