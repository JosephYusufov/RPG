public class Assassin extends Protagonist{  //hw44#3,4
    
    public Assassin (String name){  //hw44#3
        super(name);  //hw44#3
        attack *= 3;
        defense *= 0.5;
    }

    public String toString(){
        return super.toString() + "\n A deadly assassin indeed!";  //hw46#1,2
    }
}
