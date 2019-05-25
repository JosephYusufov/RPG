/**
    A collection of objects in an array can be very useful if the objects in        //hw46#3,4
the collection have some attribute that is unique only to them, so as to            //hw46#3,4
not create an entirely new field in the respective classes of these objects.        //hw46#3,4
    A strength of Object-oriented programming is that when a programmer wants to    //hw46#3,4
add attributes to a set of objects, he/she doesn't need to (and shouldn't)          //hw46#3,4
change the class where the object is defined, especially if they did not make       //hw46#3,4
the class themselves.
**/

public class UserOfRPGv2{
    public static void main(String[] commandLine){
        Protagonist proto = new Protagonist("Jeff");
        Knight knight     = new Knight("Stacy");
        Duelist duel      = new Duelist("George");
        Assassin sassin   = new Assassin("Amy");
        Monster mono      = new Monster();
        Slime slime      = new Slime();
        Rogue rogue   = new Rogue();
        Boss boss         = new Boss();

        Character[] agents = {proto, knight, duel, sassin, mono, slime,//hw46#3,4
                              rogue, boss
                             };
        Character[] peanutAllergy = {slime, boss, knight};             //hw46#3,4
        Character[] hasPeanuts = {rogue, proto};             //hw46#3,4
        for (int index = 0; index < agents.length; index++) {
            System.out.println(agents[index]);
        }
        System.out.println("These are the unfortunate few with a very nutty" +
                           " weakness: ");
        System.out.println();
        for (int index = 0; index < peanutAllergy.length; index++) {
            System.out.println(peanutAllergy[index]);
        }
    }
}
