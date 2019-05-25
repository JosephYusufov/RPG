public class Protagonist extends Character {
    protected String name;
        private final double BASE_ATK;
        private final int BASE_DEF;

    public Protagonist(String name){
        this.name = name;
        strength = 35;
        health = 150;
        attack = BASE_ATK = 1;
        defense = BASE_DEF = 20;
    }

    public String getName(){
        return name;
    }

    public void specialize(){
        attack *= 2;
        defense /= 2;
    }

    public void normalize(){
        attack = BASE_ATK;
        defense = BASE_DEF;
    }
    public String toString(){
        return ("The hero " + name +
                " , a brave and righteous warrior. His/Her attributes are as follows: \n"
               + "Health: "     + health    + System.lineSeparator()
               + "Strength: "   + strength  + System.lineSeparator()
               + "Defense: "    + defense   + System.lineSeparator()
               + "Attack: "     + attack    + System.lineSeparator()
               );
    }
}
