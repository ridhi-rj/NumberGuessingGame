import java.util.*;
public class NumberGame {

    private final int MIN = 1;    //Minimum Range
    private final int MAX = 100;  //Maximum Range

    public void guesser() {
        Scanner sc = new Scanner(System.in);
        rules();

        int num, attempts = 1;
        int myNum = randomNumber();
        try{
            do {
                System.out.print("Attempt "+(attempts++)+": ");
                num = sc.nextInt();

                if (num == myNum){
                    System.out.println("\nCorrect Answer!");
                    System.out.println("YOU WON THE GAME!");
                    break;
                }
                if(attempts <= 10) {
                    if (num < myNum) {
                        System.out.println("Too Low! Try Again\n");
                    } else {
                        System.out.println("Too High! Try Again\n");
                    }
                }

            }while (attempts <= 10);

            if(attempts >= 10 && num != myNum) {
                System.out.println("\nIncorrect Answer! Number of Attempts exceeded.");
                System.out.println("My number was " + myNum);
            }

        }
        catch(Exception e){
            System.out.println("\nINPUT MISMATCH, PLEASE TRY AGAIN");
        }
        finally {
            System.out.println("\nTHANK YOU FOR PLAYING");
        }
    }

    //Displays rules and regulations for the game
    private void rules() {
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
        System.out.println("***** RULES *****");
        System.out.println("• I have a secret number between "+MIN+" and "+MAX+".");
        System.out.println("• To win the game, guess my number.");
        System.out.println("• You have 10 attempts to guess my secret number.");
        System.out.println("ALL THE BEST!\n");
    }


    //Generates a random number between MIN and MAX
    private int randomNumber(){
        Random random = new Random();
        return random.nextInt(MAX - MIN + 1) + MIN;

    }
}