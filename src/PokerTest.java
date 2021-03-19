public class PokerTest {

    //this class must remain unchanged
    // your code must work with this test class
    public static void main(String[] args){
        if(args.length<1){
            Game g = new Game();
            System.out.println("TestPlay");
            g.testPlay();
        }
        else{
            Game g = new Game(args);
            System.out.println("play");
            g.play();
        }
    }
}
