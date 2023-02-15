package units;

import java.util.Random;

public abstract class Attacking_class extends BaseHero {
    
    protected int attack;

    public Attacking_class(String name, int hp, int def, int attack){
        super(name, hp, def);
        this.attack = attack;
    }

    public void Attack(BaseHero target) {
        int damage = new Random().nextInt(10, 20);
        target.GetDamage(damage);
    }
}
