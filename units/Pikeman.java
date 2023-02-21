package units;

public class Pikeman extends Attacking_class {

    public Pikeman(String name, Point pointXY) {
        super(name, 5, 1, 3, 10, 4, 4, pointXY);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Копейщик " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}