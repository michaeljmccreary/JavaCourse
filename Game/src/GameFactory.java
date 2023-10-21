public class GameFactory {
    public static Game getGame(String gameType) {
        if (gameType.equalsIgnoreCase("word")) {
            return new GuessTheWord();
        } else if (gameType.equalsIgnoreCase("number")) {
            return new GuessTheNumber();
        }
        return null;
    }
}
