package units;

public class Monk extends Mag {

    public Monk(String name) {
        super(name, 7, -4, -4, 30, 5, 1);
    }

    @Override
    public String getInfo() {
        return "Монах " + name + " (" + "Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Монах " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}