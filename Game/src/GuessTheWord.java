public class GuessTheWord extends Game{

    private String secret;
    private String guess;
    private String[] words;

    @Override
    public void initialise() {
        words = new String[]{"Car", "Orange", " Bicycle", " Umbrella", "Book"};
        secret = words[(int) (Math.random()*5)];
    }

    @Override
    public void instructions() {
        System.out.println("Enter a word");
        guess = in.next();
    }

    @Override
    public void checkGuess() {
        if(guess.equalsIgnoreCase(secret)){
            output = "Congratulations you have guessed correctly";
        } else {
            output = "You have guessed incorrectly, Please try again";
        }
    }
}
