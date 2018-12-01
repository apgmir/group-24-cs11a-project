import java.util.Scanner;

public class MainGame {
    public static Scanner in = new Scanner(System.in);
    public static String question;
    public static String user = "";

    public static void main(String[] args) {

        question = "0";

        // Game loop
        while (true) {
            if (user.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                switch (question) // If question is equal to...
                {
                case "0": // ... zero
                    System.out.println("Storyline .... what is your name?");

                    question = "1";
                    break;

                case "1":
                    user = in.next();
                    question = "1A"; // 1A means answer to Q1

                    break;

                case "1A":
                    System.out.println("more story, are you sure this is your name? \nIf yes input 1, if no input 2");
                    in.next();
                    question = "2";
                    break;

                case "2":
                    switch (user = in.next()) 
                    {
                    case "1":
                        System.out.println("more story, ask another question");

                        question = "2A";
                        break;

                    case "2":
                        System.out.println("\n\n");
                        question = "0";
                        break;
                    }
                    break;
                }

            }
        }
    }
}
