package units;

public class Mag extends BaseHero {

    protected int magic;

    public Mag(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int magic) {
        super(name, defense, minDamage, maxDamage, hp, speed);
        this.magic = magic;
    }
}
