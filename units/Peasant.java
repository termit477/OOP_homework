package units;

import java.util.ArrayList;

public class Peasant extends BaseHero {

    int delivery;

    public Peasant(String name, int pointX, int pointY) {
        super(name, 1, 1, 1, 1, 1, 3, pointX, pointY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Фермер", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage, "Здоровье:",
                hp, "Скорость:", speed);
    }

    @Override
    public String getClassHero() {
        return "Фермер";
    }

    @Override
    public String toString() {
        return state + " " +
                getClassHero() + " " +
                name +
                " Hp:" + Math.round(hp) +
                " Def:" + defense +
                " Coords:" + pointXY.x + "." + pointXY.y;
    }

    @Override
    public boolean step(ArrayList<BaseHero> ours, ArrayList<BaseHero> foreign) {
        if (!state.equals("Die")){
            state = "Stand";
            return true;
        }
        return false;
    }
}
