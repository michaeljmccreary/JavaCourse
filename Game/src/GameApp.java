import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a game type: word/number");
        String gameType=in.next();
        Game game = GameFactory.getGame(gameType);
        game.play();
    }
}
