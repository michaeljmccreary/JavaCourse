import java.util.Scanner;

public abstract class Game {
    protected Scanner in;
    protected String output;

    public Game(){
        in = new Scanner(System.in);
    }

    public abstract void initialise();
    public abstract void instructions();
    public abstract void checkGuess();

    public void output(){
        System.out.println(output);
    }

    public void play(){
        initialise();
        instructions();
        checkGuess();
        output();
    }
}
