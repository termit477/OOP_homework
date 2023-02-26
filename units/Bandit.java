package units;

public class Bandit extends BaseHero {

    public Bandit(String name, int pointX, int pointY) {
        super(name, 8, 3, 2, 4, 10, 6, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Разбойник", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage, "Здоровье:", hp,
                "Скорость:", speed);
    }
}
