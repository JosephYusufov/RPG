public class Slime extends Monster {  //hw44#3,4

    public Slime() {  //hw44#3
        super();  //hw44#3
    }
    //Special attack method, the Slime takes recoil damage.  //2019-02-08 notes         //hw46#moreThinking
    public int attack(Character target){                        //hw3E#0                //hw46#moreThinking
        lowerHP((int)(strength * attack / 10));                 //hw3E#0                //hw46#moreThinking
        return super.attack(target);                            //hw3E#0  //hw44#3,4    //hw46#moreThinking
    }                                                           //hw3E#0                //hw46#moreThinking
    public String toString(){
        return super.toString() + "\n A feared Slime indeed!";  //hw46#1,2
    }
}


//Vampire
