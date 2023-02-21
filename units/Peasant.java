package units;

public class Peasant extends Attacking_class {

    int delivery;

    public Peasant(String name, Point pointXY) {
        super(name, 1, 1, 1, 1, 3, 1, pointXY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage
                + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Доставка - " + delivery + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Крестьянин " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}
