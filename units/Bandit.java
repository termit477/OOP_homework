package units;

import java.util.ArrayList;

public class Bandit extends BaseHero {

    public Bandit(String name, int pointX, int pointY) {
        super(name, 8, 3, 2, 4, 50, 6, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Разбойник", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp, "Скорость:", speed);
    }

    @Override
    public String getClassHero() {
        return "Разбойник";
    }

    @Override
    public boolean step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (state.equals("Die"))
            return false;
        BaseHero victim = foreign.get(findTheNearest(foreign));
        if (victim.pointXY.getDistance(pointXY) < 2) {
            float damage = (victim.defense - attack) > 0 ? minDamage
                    : (victim.defense - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
            victim.getDamage(damage);
        } else {
            Point tempvc = pointXY.chooseWay(victim.pointXY);
            if (Math.abs(tempvc.x) < Math.abs(tempvc.y)) {
                if (pointXY.chooseWay(victim.pointXY).y > 0) {
                    pointXY.y--;
                } else {
                    pointXY.y++;
                }
            } else {
                if (pointXY.chooseWay(victim.pointXY).x > 0) {
                    pointXY.x--;
                } else {
                    pointXY.x++;
                }
            }
        }
        return true;
    }
}
