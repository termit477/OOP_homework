package units;

public class Sniper extends Archer {

    public Sniper(String name) {
        super(name,  5, 5);
    }
    
    public String getInfo(){
        return "Снайпер " + name;
    }
}