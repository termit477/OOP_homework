import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import units.*;

public class main {

    static final int UNITS = 10;
    public static ArrayList<BaseHero> light = new ArrayList<>();
    public static ArrayList<BaseHero> dark = new ArrayList<>();
    public static ArrayList<BaseHero> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Нажмите 'Enter' для старта игры.");
        user_input.nextLine();

        createTeam(light, 0, 1);
        createTeam(dark, 3, 10);

        allTeam.addAll(light);
        allTeam.addAll(dark);
        sortTeam(allTeam);

        System.out.println("___Добро___");
        showTheTeam(light);

        System.out.println("___Зло___");
        showTheTeam(dark);

        System.out.println("___Бойня___");
        // boolean game = true;
        int countLight = 0;
        int countDark = 0;
        while (true) {
            View.view();
            user_input.nextLine();
            countLight = 0;
            countDark = 0;

            for (BaseHero hero : allTeam) {
                if (light.contains(hero)) {
                    if (hero.step(light, dark) == true)
                        hero.step(light, dark);
                    else
                        countLight++;
                } else {
                    if (hero.step(dark, light) == true)
                        hero.step(dark, light);
                    else
                        countDark++;
                }
            }
            if (countLight == UNITS || countDark == UNITS) {
                // game = false;
                break;
            }
        }

        if (countLight == UNITS)
            System.out.println("Зло победило");
        else
            System.out.println("Добро победило");
    }

    static void showTheTeam(ArrayList<BaseHero> team) {
        team.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("----------------------------------------------------------------------------------------");
    }

    static void createTeam(ArrayList<BaseHero> team, int offset, int pointX) {
        for (int i = 1; i <= UNITS; i++) {
            switch (new Random().nextInt(4) + offset) {
                case 0:
                    team.add(new Pikeman(Pikeman.getName(), pointX, i));
                    break;
                case 1:
                    team.add(new Crossbowman(Crossbowman.getName(), pointX, i));
                    break;
                case 2:
                    team.add(new Monk(Monk.getName(), pointX, i));
                    break;
                case 3:
                    team.add(new Peasant(Peasant.getName(), pointX, i));
                    break;
                case 4:
                    team.add(new Bandit(Bandit.getName(), pointX, i));
                    break;
                case 5:
                    team.add(new Sniper(Sniper.getName(), pointX, i));
                    break;
                case 6:
                    team.add(new Magician(Magician.getName(), pointX, i));
                    break;
                default:
                    break;
            }
        }
    }

    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero hero1, BaseHero hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });
    }

}