package units;

public class Mag extends BaseHero {

    protected int magic;

    public Mag(String name, int defense, int minDamage, int maxDamage, int hp, int speed, int magic, Point pointXY) {
        super(name, defense, minDamage, maxDamage, hp, speed, pointXY);
        this.magic = magic;
    }
}
