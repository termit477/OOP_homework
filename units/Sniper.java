package units;

public class Sniper extends Archer {

    public Sniper(String name, Point pointXY) {
        super(name, 10, 8, 10, 15, 9, 12, 32, pointXY);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Снайпер " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}