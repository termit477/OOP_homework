package units;

public class Crossbowman extends Archer {
    
    public Crossbowman(String name) {
        super(name, 3, 3);
    }
    
    public String getInfo(){
        return "Арбалетчик " + name;
    }
}
