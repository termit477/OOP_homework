package units;

public class Crossbowman extends Archer {

    public Crossbowman(String name, Point pointXY) {
        super(name, 3, 2, 3, 10, 4, 6, 16, pointXY);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Арбалетчик " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }
}
