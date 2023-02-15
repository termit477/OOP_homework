package units;

import java.util.Random;

public abstract class Archer extends Attacking_class {

    protected int shots, maxShots;

    public Archer(String name, int shots, int maxShots) {
        
        super(name, new Random().nextInt(100, 130), 5, new Random().nextInt(10, 30));
        this.shots = shots;
        this.maxShots = maxShots;
    }
}