import java.util.ArrayList;

public class Game {
    private Player p;
    private Deck cards;
    private ArrayList<Card> hand;
    //you may want some more here
    public Game (String[] testHand) {
        //this constructor is to help test your code.
        //use the contents of testHand to
        // make a hand for the player
        //you must use the following encoding for cards
        //c = clubs
        //d = diamonds
        //h = hearts
        //s = spades
        //1-13 correspond to ace-king
        //example: s1 = ace of spades
        //example: testhand= {s1, s13, s12, s11, s10} = royal flush
    }

    public Game(){
        //This no-argument constructor is to actually play a normal game
    }
    public void play() {
        //this method should play the game
    }

    public void testPlay(){
        //this method is used for testing the checkHand method
        //it should evaluate the hand that was passed
        //as a command-line argument and print the result
    }
    public int checkHand(ArrayList<Card> hand) {
        //this method should take an ArrayList of five Card objects as input
        //evaluate the hand
        //print the result to the console so user can see it.
        //return the multiplier that the bet should be multiplied by
        //you'll want to break this up into a bunch of helper methods
        return 1;
    }

}
