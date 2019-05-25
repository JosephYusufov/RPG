public class Rogue extends Monster {  //hw44#3,4

    public Rogue() {  //hw44#3
        super();  //hw44#3
        attack *= 2;
        defense /= 2;
    }
    public String toString(){
        return super.toString() + "\n A dangerous rogue indeed!";  //hw46#1,2
    }
}

//Attacker
