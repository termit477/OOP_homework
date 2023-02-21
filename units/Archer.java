package units;

import java.util.ArrayList;

public abstract class Archer extends Attacking_class {

    protected int shots;

    public Archer(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int attack, int shots, Point pointXY) {
        super(name, defense, minDamage, maxDamage, hp, speed, attack, pointXY);
        this.shots = shots;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2){
        
    }
}