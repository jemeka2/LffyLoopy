import java.util.Scanner;

public class LffyLoop {
    public static void main(String[] args)
    {
        //Loopy
        Scanner kybd = new Scanner(System.in);

        //Variables
        String phrase = "";

        for(int i = 1; i <= 5; i++){
            System.out.println("Please enter a word: ");
            String word = kybd.next();
            phrase += word + " ";
        }


        //Lffy

        //Variables
        boolean redEyes = true;
        String userInput;


        //While loop to ask question
        while(redEyes == true)
        {
            System.out.println("Are your eyes red (y/n)");
            userInput = kybd.next();

            if(userInput.equals("y")){
                System.out.println("Get Some Sleep");
                System.out.println(("Would you like to try again?(y/n)"));
                userInput = kybd.next();
                if(userInput.equals("n")){
                    redEyes = false;
                    System.out.println("Your phrase was: " + phrase);
                    System.out.println("Program is finished!");
                }
            }
            else if(userInput.equals("n")){
                System.out.println("You look Great!");
                redEyes = false;
                System.out.println("Your phrase was: " + phrase);
                System.out.println("Program is finished!");
            }
            else{
                System.out.println("Please Enter (y/n)");//if the user inputs anything other (y/n) they will be asked again
            }

        }
    }
}
