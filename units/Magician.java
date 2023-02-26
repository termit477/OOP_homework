package units;

public class Magician extends Mag {

    public Magician(String name, int pointX, int pointY) {
        super(name, 17, 12, -5, -5, 30, 9, 10, pointX, pointY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
        state, "Колдун", name, "Атака:", attack, "Защита:", defense, "Урон:", minDamage, maxDamage, "Здоровье:", hp,
        "Скорость:", speed, "Мана:", mana);
    }
}