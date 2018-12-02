import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrandeisExperience{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Welcome to the Brandeis experience!");
    System.out.println();
    System.out.println("You will be taken through the day of a typical deisian.");
    System.out.println();

    String name;
    String major;
    String residence;
    String year;

    System.out.println("First, let's create your profile.");
    System.out.println();

    System.out.println("What is your name?");
    name = TextIO.getln();
    System.out.println("Stem or Humanities?");
    major= TextIO.getln();
    System.out.println("What is your residence hall?");
    residence = TextIO.getln();
    System.out.println("What is your class? ");
    year = TextIO.getln();

    System.out.println();
    System.out.println("Great "+ name +", now let's get started!");

    System.out.println("Good morning! It is a monday and you have to go to class.");
    System.out.println("What are you eating for breakfast?");
    System.out.println("a.) yogurt in your room");
    System.out.println("b.) einsteins's bagels");
    System.out.println("c.) lower dining hall");
    String breakfast = input.next();
    if (breakfast.equals("a")) {
      System.out.println("great choice.");
    } else if (breakfast.equals ("b")){
      System.out.println("nice! One of the few palettable choices here.");
    } else if (breakfast.equals ("c")) {
      System.out.println("interesting choice, make sure to bring some tums.");
    } else {
      System.out.println("I dont know what breakfast that is. Enter a, b, or c.");
    }

    System.out.println();
    System.out.println("Breakfast time is over, " + name +". Better get on your way or you will be late");
    System.out.println();
    System.out.println("whoops! on your way to class you bumped into someone and spilled their drink");
    System.out.println("What do you do?");

    if (major.equals("stem")) {
      System.out.println("a.) Ugh, I'm a premed, I dont have time for this. Out of my way, I'm late for my 8am");
      System.out.println("b.) help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equals("a")) {
        System.out.println("sounds about right. Get to class!");
      } else if (drinkspill.equals ("b")){
        System.out.println("good job! Give yourself a pat on the back");
      }
    }
    if (major.equals("humanities")){
      System.out.println("a.) you don't even notice them, too busy aniticpating the walk up rabb steps");
      System.out.println("b.) help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equals("a")) {
        System.out.println("sounds about right. Get to class!");
      } else if (drinkspill.equals ("b")){
        System.out.println("good job! Give yourself a pat on the back");
      } else {
        System.out.println("not sure about that one. Enter a or b");
      }
    }

    System.out.println();
    if (major.equals("humanities")){
      System.out.println("You finally made it up the rabb steps.");
      System.out.println("Out of breath, you stumble into class only to find that someone has stolen YOUR seat!");
    }
    if(major.equals("stem")){
      System.out.println("You finally made it to gzang.");
      System.out.println("Out of breath, you stumble into class only to find that someone has stolen YOUR seat!");
    }
    System.out.println("you, an angered and entitled student, are outraged.");
    System.out.println("You are class of " + year +", for God's sake. you desrve better" );
    System.out.println("What's your next move?");
    System.out.println("a.) approach them and tell them to get out of your seat");
    System.out.println("b.) passive aggressively sit in the seat right next to them");
    System.out.println("c.) skip class.");
    String answer = input.next();
    if (answer.equals("a")) {
      System.out.println("power move. class proceeds");
    } else if (answer.equals ("b")){
      System.out.println("good move. class proceeds");
    } else if (answer.equals ("c")) {
      System.out.println("yikes, now you missed a pop quiz. whoops! zero for you");
    } else {
      System.out.println("That doesn't sound like a great idea. Enter a, b, or c.");
    }

    System.out.println();
    System.out.println("Class is over! time to make use of your afternoon. what would you like to do?");
    System.out.println("a. Do some homework");
    System.out.println("b. go to the gym");
    String afternoon = input.next();
    if (afternoon.equals("a")){
      System.out.println("where?");
      System.out.println("a.) library");
      System.out.println("b.) back to your room in " + residence + ".");
      String location = input.next();
      if (location.equals("a")){
        System.out.println("You spend 15 minutes wandering aorund the library, unable to find a seat");
        System.out.println("Looks like you can't work here! Go back to " + residence +" to work.");
        System.out.println("You know you wanted to anyway");
        System.out.println();
      } else if (location.equals("b")){
        System.out.println("great choice");
      } else {
        System.out.println("Don't do your work there. Enter a or b.");
      }
      System.out.println();

      if (major.equals("stem")) {
        System.out.println("here is a placeholder for the math hw you will do");
        //run math problem method
      } else if (major.equals("humanities")) {
        System.out.println("Time for spanish homework!");
        // run spanish quiz method
      }
      System.out.println();
      System.out.println("That was produtive! Good job.");
    }
    else if (afternoon.equals("b")){
      System.out.println("Nice! Let's play some tennis");
      // here is where tennis game will go
    } else {
      System.out.println("You wanna do WHAT?? just enter a or b");
    }
      System.out.println();

    System.out.println("wow, you are so hungry after such a long and hard day as a diligent brandeis student.");
    System.out.println("What are you thinking for dinner?");
    System.out.println("a.) Sherman");
    System.out.println("b.) Upper");
    System.out.println("c.) Stein");
    System.out.println("d.) You've given up and are rich. takeout");
    String dinner = input.next();
    if (dinner.equals("a")){
      System.out.println("nice! go enjoy a comfortable meal with your friends in a stressful environment.");
      System.out.println("make sure to check out both sides because there will not be enough options.");
      System.out.println("you will definitely need tums for this one.");
    } else if (dinner.equals("b")){
      System.out.println("yum!");
    } else if (dinner.equals("c")){
      System.out.println("kick back and get some chicken wings with your pals.");
      System.out.println("maybe there will be music playing!");
      System.out.println("dont forget to grab a beer form the bar, but you MUST bring 2 forms of ID");
    } else if (dinner.equals("d")){
      System.out.println("by far the best option.");
      System.out.println("dont put your body through the atrocities of sodexo.");
      System.out.println("take care of yourself.");
    } else {
      System.out.println("Dont eat there. Choose a, b, c or d");
    }

    System.out.println();
    System.out.println("that was exhausting. time to kick back and relax for the rest of the evening.");
    System.out.println("you definitely dont have any work you should be doing");
    System.out.println("what do you want to do to relax?");
    System.out.println("a.) netflix and chill");
    System.out.println("b.) game room");
    System.out.println("c.) hang out in " + residence + " with friends");
    System.out.println("d.) kick back? its time to sleep.");
    String evening = input.next();
    if (evening.equals("a")){
      System.out.print("sounds good");
      String url = "http://www.netflix.com";

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
      //launch netflix hyperink
    } else if (evening.equals("b")) {
      System.out.println("good idea!");
      //another game method?
    } else if (evening.equals("c")) {
      System.out.println("have fun!");
    } else if (evening.equals("d")) {
      System.out.println("too true.");
    } else {
      System.out.println("please enter a, b, c, or d");
    }

    System.out.println();
    System.out.println("wow. what a day as a hard working, passionate, and inspired student here at this insitution.");
    System.out.println("cant wait to do the same thing again tomorrow!");
    System.out.println("goodnight!");


  }
}
