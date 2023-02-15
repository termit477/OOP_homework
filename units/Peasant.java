package units;

import java.util.Random;

public class Peasant extends BaseHero {
    
    public Peasant(String name) {
        super(name, new Random().nextInt(100, 120), 5);
    }

    @Override
    public String getInfo(){
        return "Крестьянин " + name;
    }
}
