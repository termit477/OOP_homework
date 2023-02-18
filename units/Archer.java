package units;

public abstract class Archer extends Attacking_class {

    protected int shots;

    public Archer(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int attack, int shots) {
        super(name, defense, minDamage, maxDamage, hp, speed, attack);
        this.shots = shots;
    }
}