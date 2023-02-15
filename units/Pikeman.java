package units;

import java.util.Random;

public class Pikeman extends Attacking_class {

    public Pikeman(String name) {
        super(name, new Random().nextInt(180, 200), 10, new Random().nextInt(10, 20));
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name;
    }

}