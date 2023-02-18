package units;

public class Magician extends Mag {

    public Magician(String name) {
        super(name, 12, -5, -5, 30, 9, 1);
    }

    @Override
    public String getInfo() {
        return "Колдун " + name + " (" + "Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Колдун " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}