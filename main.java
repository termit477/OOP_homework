import java.util.ArrayList;
import units.*;

public class main {
    public static void main(String[] args) {

        ArrayList<BaseHero> Hero = new ArrayList<>();

        Hero.add(new Sniper(Sniper.getName()));
        Hero.add(new Crossbowman(Crossbowman.getName()));
        Hero.add(new Bandit(Bandit.getName()));
        Hero.add(new Pikeman(Pikeman.getName()));
        Hero.add(new Pikeman(Pikeman.getName()));
        Hero.add(new Magician(Magician.getName()));
        Hero.add(new Monk(Monk.getName()));
        Hero.add(new Monk(Monk.getName()));
        Hero.add(new Peasant(Peasant.getName()));
        Hero.add(new Peasant(Peasant.getName()));

        Hero.forEach(n -> System.out.println(n.getInfo()));
    }
}
