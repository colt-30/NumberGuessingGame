import java.util.Random;
import java.util.Scanner;

public class Game {
    int computer;
    public Game(){
        Random random = new Random();
        computer = random.nextInt(100);
        System.out.println("Guess the Number from 1 to 100 ");
    }

    public int computerNo(){
        return computer;
    }


    public class userInput{
        static int takeUserInput(){
            int user;
            System.out.println("Enter ");
            Scanner sc = new Scanner(System.in);
            user=sc.nextInt();
            return user;
        }

        static void isCorrectNumber(int i, int j){
            if(i==j){
                System.out.println("Correct No. Guess ");
            }else if(i>j){
                System.out.println("Your No. is bigger than computer No.");
            }else{
                System.out.println("Your No. is smaller than computer No. ");
            }
        }
    }
    public static void main(String[] args) {
        int user=0, computer=0, iteration=0;
        Game game = new Game();
        do{

            user = userInput.takeUserInput();
            computer = game.computerNo();

            userInput.isCorrectNumber(user, computer);
            iteration++;
        }while(user!=computer);
        System.out.println("YOU GUESS NUMBER IN " + iteration + " ITERATIONS");
    }
}
