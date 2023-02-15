package units;

import java.util.Random;

public class Magician extends Mag {

    public Magician(String name) {
        super(name, new Random().nextInt(100, 150), 5, new Random().nextInt(10, 30));
    }

    @Override
    public String getInfo(){
        return "Колдун " + name;
    }
}