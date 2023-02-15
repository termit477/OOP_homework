package units;

import java.util.Random;

public class Monk extends Mag {

    public Monk(String name) {
        super(name, new Random().nextInt(100, 130), 5, new Random().nextInt(10, 30));
    }

    @Override
    public String getInfo(){
        return "Монах " + name;
    }
}