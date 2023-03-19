package units;

import java.util.ArrayList;

public interface GameInterfase {
    
    boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    
    String getInfo();
}
