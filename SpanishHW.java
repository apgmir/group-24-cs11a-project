import java.util.Scanner;
public class SpanishHW {
    public static void main (String [] args){
    System.out.println("Time for Spanish HW \nLet's work on your translations");
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What does \"Hola como estas?\" mean?");
    System.out.println("1)Hey friend \n2)It's wednesday my dudes \n3)Hi, how are you?");
    int answer1 = scan.nextInt();
    
    
    switch(answer1){
        case 1:
            System.out.println("Incorrect");
            break;
        case 2:
            System.out.println("That's a vine reference");
            break;
        case 3:
            System.out.println("Exacto");
            break;
    }
}
}
