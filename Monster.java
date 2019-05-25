public class Monster extends Character {
    
    public Monster(){
        strength = (int)(Math.random() * 45) + 20;
        health = 150;
        attack = 1;
        defense = 20;
    }
    public String toString(){
        return ("This vile monster" +
                " , a disgusting, godless creature. His/Her attributes are as follows: \n"
               + "Health: "   + health    + System.lineSeparator()
               + "Strength: " + strength  + System.lineSeparator()
               + "Defense: "    + defense   + System.lineSeparator()
               + "Attack: "     + attack    + System.lineSeparator()
               );
    }

}
