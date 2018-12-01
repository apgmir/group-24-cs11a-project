import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstOption, secondOption, thirdOption;
        System.out.println("WELCOME TO THE BRANDEISIAN EXPERIENCE!");
        System.out.println();
        System.out.println("Good Morning! It's a Monday and you need to get ready for class. What do you eat for breakfast? \"yougurt in the dorm room\" or into the");
        System.out.println("\"Einsteins\"\"Lower\" ?");
        System.out.print("> ");
        firstOption = keyboard.next();
        System.out.println();
        if (firstOption.equalsIgnoreCase("Lower")) {
            System.out.println("Sounds good make sure to bring some tums");
            
			if (firstOption.equalsIgnoreCase("Yogurt in the dorm room"))
            		System.out.println("Yum but don't be late/go back into bed")
			if(firstOption.equalsIgnoreCase("Esteins")
				System.out.println("Yum!")
			
