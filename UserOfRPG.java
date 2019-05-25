/**
    CREDIT TO MR. BROWN FOR MOST OF THIS FILE //hw3C#concepts and basic honesty
  Exercise the classes in the Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Protagonist, Monster
 */

// shorthand, used to read from CLI
import java.io.*;
import java.util.*;

public class UserOfRPG //hw3C#0
{
    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    private Protagonist pat;   //Is it man or woman?        //hw46#6
    private Monster smaug; //Friendly generic monster name? //hw46#6

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;


    public UserOfRPG() {
        moveCount = 0;
        gameOver = false;
        isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
        newGame();
    }


    /*=============================================
    void newGame() -- gathers info to begin a new game
    precondition:
    post: according to user input, modifies instance var for difficulty
    and instantiates a Protagonist
    =============================================*/
    public void newGame() {
        String s;
        String name = "";
        String specialty = "";
        s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

        s += "\nChoose your difficulty: \n";
        s += "\t1: Easy\n";
        s += "\t2: Not so easy\n";
        s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
        s += "Selection: ";
        System.out.print( s );

        try {
            difficulty = Integer.parseInt( in.readLine() );
        } catch ( IOException e ) { }

        s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
        System.out.print( s );

        try {
            name = in.readLine();
        } catch ( IOException e ) { }

        //Prompting the user to select a class based on their Input  //2019-02-08 notes
        s = name + ", before you embark on your quest, you must choose a character!\n"; //hw44#6
        s += "\tKnight: Strong and Resiliant\n";                                        //hw44#6
        s += "\tDuelist: Skillful and Lucky\n";                                         //hw44#6
        s += "\tAssassin: Deadly and Nimble\n";                                          //hw44#6
        s += "Selection: ";                                                             //hw44#6

        System.out.print( s );                                                          //hw44#6

        try {
            specialty = in.readLine();
        } catch ( IOException e ) { }

        //instantiate the player's character
        if (specialty.equals("1")) {
            pat = new Knight( name );
        } else if (specialty.equals("2")) {
            pat = new Duelist( name );
        } else {
            pat = new Assassin( name );
        }

    }//end newGame()


    /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    @return the boolean value of
        "the player survives"
    =============================================*/
    public boolean playTurn() {
        int d1, d2;
        Character leader;

        //Create a Monster that is randomly selected from the three classes //2019-02-08 notes
        if ( Math.random() >= ( difficulty / 3.0 ) )
            System.out.println( "\nNothing to see here. Move along!" );
        else if (Math.random() >= 0.6666) {
            System.out.println( "\nLo, yonder Rogue approacheth!" );
            smaug = new Rogue();
        } else if (Math.random() >= 0.3333){
            smaug = new Slime();
            System.out.println( "\nLo, yonder Slime approacheth!" );
        } else {
            smaug = new Boss();
            System.out.println( "\nLo, yonder Boss approacheth!" );
        }

        while( smaug.isAlive() && pat.isAlive() ) {

            /* Give the user the option of using a special attack.
               If you land a hit, you cause greater damage,
               ...but if you get hit, you incur more damage.
               */
            int choice = 0;
            try{
                System.out.println( System.lineSeparator()
                  + "Do you feel lucky?" + System.lineSeparator()
                  + "    1: Nay"         + System.lineSeparator()
                  + "    2: Aye!" );
                choice = Integer.parseInt( in.readLine() );
            }
            catch( IOException e ) { }

            if ( choice == 2 ) pat.specialize();
            else pat.normalize();

            d1 = pat.attack( smaug );  //hw3E#0
            d2 = smaug.attack( pat );  //hw3E#0

            //Determine the Leader
            if(pat.getHealth() > smaug.getHealth()) leader = pat;
            else leader = smaug;

            System.out.println( "\n" + pat.getName() + " dealt "
                              + d1 + " points of damage.");

            System.out.println( "\n" + "Ye Olde Monster smacked "
                              + pat.getName() + " for "
                              + d2 + " points of damage.");
            System.out.println( smaug );  //hw46#1,2
            System.out.println( pat );    //hw46#1,2
            System.out.println("The leading Character\n");
            System.out.println( leader );
        }//end while

        //option 1: you & the monster perish
        if ( !smaug.isAlive() && !pat.isAlive() ) {
            System.out.println( "'Twas an epic battle, to be sure... " +
            "You cut ye olde monster down, but " +
            "with its dying breath ye olde monster. " +
            "laid a fatal blow upon thy skull." );
            return false;
        }
        //option 2: you slay the beast
        else if ( !smaug.isAlive() ) {
            System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
            return true;
        }
        //option 3: the beast slays you
        else if ( !pat.isAlive() ) {
            System.out.println( "Ye olde self hath expired. You got dead." );
            return false;

        } //end else

        return true;
    }//end playTurn()


    public static void main( String[] args ) {

        //loading...
        UserOfRPG game = new UserOfRPG();

        int encounters = 0;

        while(    encounters < MAX_ENCOUNTERS
               && game.playTurn() ) {
            encounters++;
            System.out.println();
        }

        System.out.println( "Thy game doth be over." );
    }//end main

}//end class UserOfRPG
