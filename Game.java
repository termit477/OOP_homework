import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import units.*;

public class Game {
    public static void main(String[] args) {

        ArrayList<BaseHero> Light = new ArrayList<>();
        ArrayList<BaseHero> Dark = new ArrayList<>();
        ArrayList<BaseHero> QueueForAMove = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    Light.add(new Pikeman(Pikeman.getName()));
                    break;
                case 1:
                    Light.add(new Crossbowman(Crossbowman.getName()));
                    break;
                case 2:
                    Light.add(new Monk(Monk.getName()));
                    break;
                case 3:
                    Light.add(new Peasant(Peasant.getName()));
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    Dark.add(new Bandit(Bandit.getName()));
                    break;
                case 1:
                    Dark.add(new Sniper(Sniper.getName()));
                    break;
                case 2:
                    Dark.add(new Magician(Magician.getName()));
                    break;
                case 3:
                    Dark.add(new Peasant(Peasant.getName()));
                    break;
                default:
                    break;
            }
        }

        System.out.println("___Свет___");
        Light.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("--------------------------------------------");

        System.out.println("___Тьма___");
        Dark.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("--------------------------------------------");

        QueueForAMove.addAll(Light);
        QueueForAMove.addAll(Dark);

        QueueForAMove.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero hero1, BaseHero hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });

        QueueForAMove.forEach(n -> System.out.println(n.getInfoForQueue()));
    }
}