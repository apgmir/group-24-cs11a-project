import java.util.Scanner;
public class SpanishHW {
    public static void main (String [] args){
    System.out.println("Time for Spanish HW \nLet's work on your translations");
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What does \"¿Hola como estas?\" mean?");
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
            
    System.out.println("What does \"¿De donde eres?\" mean?");
    System.out.println("1) What's better than this? Guys being dudes \n2)Where are you from? \n3)Who are you?");
        int answer2 = scan.nextInt();

    switch(answer2){
        case 1:
            System.out.println("That's a vine reference");
            break;
        case 2:
            System.out.println("Exacto");
            break;
        case 3:
            System.out.println("Incorrect");
            break;
    }
System.out.println("What does \"¿Cómo conseguiste estos baches? Tienes eczema?\" mean?");
    System.out.println("1) And they were roommates \n2)How'd you get these bumps? You got eczema? \n3)Do you have a pet?");
        int answer3 = scan.nextInt();

    switch(answer3){
        case 1:
            System.out.println("That's a vine reference");
            break;
        case 2:
            System.out.println("Exacto y that's a vine reference");
            break;
        case 3:
            System.out.println("Incorrect");
            break;
    }
}
}
