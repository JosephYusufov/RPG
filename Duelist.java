public class Duelist extends Protagonist{  //hw44#3,4
    
    public Duelist (String name){  //hw44#3
        super(name);  //hw44#3
    }

    public void specialize(){
        super.specialize();
        attack *= 4;
        defense /= 4;
    }

    public String toString(){
        return super.toString() + "\n A skillful duelist indeed!";  //hw46#1,2
    }
}
