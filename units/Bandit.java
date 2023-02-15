package units;

import java.util.Random;

public class Bandit extends Attacking_class {

    public Bandit(String name) {
        super(name, new Random().nextInt(100, 200), 5, new Random().nextInt(10, 20));
    }
 
    @Override
    public String getInfo() {
        return "Бандит " + name;
    }

}
