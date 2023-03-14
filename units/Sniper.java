package units;

public class Sniper extends Shooter {

    public Sniper(String name, int pointX, int pointY) {
        super(name, 12, 10, 8, 10, 30, 9, 32, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
                state, "Снайпер", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp, "Скорость:", speed, "Снарядов:", ammo);
    }

    @Override
    public String getClassHero() {
        return "Снайпер";
    }
}