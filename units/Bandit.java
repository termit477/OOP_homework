package units;

public class Bandit extends Attacking_class {

    public Bandit(String name, Point pointXY) {
        super(name, 3, 2, 4, 10, 6, 8, pointXY);
    }

    @Override
    public String getInfo() {
        return "Бандит " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Бандит " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}
