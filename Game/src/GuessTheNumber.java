public class GuessTheNumber extends Game{

    private int secret;
    private int guess;
    private int[] numbers;
    @Override
    public void initialise() {
        numbers = new int[]{1, 2, 3, 4, 5};
        secret = numbers[(int) (Math.random()*5)];
    }

    @Override
    public void instructions() {
        System.out.println("Enter a number");
        guess = in.nextInt();
    }

    @Override
    public void checkGuess() {
        if(guess == secret){
            output = "Congratulations you have guessed correct";
        } else {
            output = "You have guessed incorrectly, Please try again";
        }
    }
}
