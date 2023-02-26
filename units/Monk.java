package units;

public class Monk extends Mag {

    public Monk(String name, int pointX, int pointY) {
        super(name, 12, 7, -4, -4, 30, 5, 10, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
        state, "Монах", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage, "Здоровье:", hp,
        "Скорость:", speed, "Мана:", mana);
    }
}