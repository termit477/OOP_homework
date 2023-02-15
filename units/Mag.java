package units;

public class Mag extends BaseHero{

    protected int mana;

    public Mag(String name, int hp, int def, int mana){

        super(name, hp, def);
        this.mana = mana;
    }
}
