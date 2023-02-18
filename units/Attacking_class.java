package units;

public abstract class Attacking_class extends BaseHero {

    protected int attack;

    public Attacking_class(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int attack) {
        super(name, defense, minDamage, maxDamage, hp, speed);
        this.attack = attack;
    }
}
