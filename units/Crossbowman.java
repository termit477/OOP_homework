package units;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, int pointX, int pointY) {
        super(name, 6, 3, 2, 3, 30, 4, 16, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
                state, "Арбалетчик", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp, "Скорость:", speed, "Снарядов:", ammo);
    }

    @Override
    public String getClassHero() {
        return "Арбалетчик";
    }
}
