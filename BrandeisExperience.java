import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class BrandeisExperience{ 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Welcome to the Brandeis experience!");
    System.out.println();
    promptEnterKey();
    System.out.println("You will be taken through the day of a typical deisian.");
    System.out.println();

    String name;
    String major;
    String residence;
    String year;

    System.out.println("First, let's create your profile!");
    System.out.println();

    System.out.println("What is your name?");
    name = TextIO.getln();
    System.out.println("What is your major? STEM or Humanities?");
    major= TextIO.getln();
    System.out.println("What is your Residence Hall?");
    residence = TextIO.getln();
    System.out.println("What is your Graduating class? ");
    year = TextIO.getln();

    System.out.println();
    System.out.println("Great "+ name +", now let's get started!");
    promptEnterKey();

    System.out.println("Good morning! It’s Monday, time to get up and ready.");
    System.out.println("What are you eating for breakfast?");
    System.out.println("a) Yogurt in your room");
    System.out.println("b) Einstein's Bagels");
    System.out.println("c) Lower dining hall");
    String breakfast = input.next();
    if (breakfast.equals("a")) {
      System.out.println("Great Choice!");
    } else if (breakfast.equals ("b")){
      System.out.println("Nice! One of the few palatable options around here.");
    } else if (breakfast.equals ("c")) {
      System.out.println("Interesting choice, make sure to bring along some Tums!");
    } else {
      System.out.println("I don’t know what breakfast that is. Enter a, b, or c.");
    }

    System.out.println();
    System.out.println("Breakfast time is over, " + name +". Better get on your way or you’ll be late");
    System.out.println();
    promptEnterKey();
    System.out.println("Whoops! On your way to class you bumped into someone and spilled their drink!");
    System.out.println("What do you do?");

    if (major.equalsIgnoreCase("stem")) {
      System.out.println("a) Ugh, I'm premed, I don’t have time for this. Out of my way, I'm late for my 8am");
      System.out.println("b) Help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equals("a")) {
        System.out.println("Sounds about right. Get to class!");
      } else if (drinkspill.equals ("b")){
        System.out.println("Good job! A good deed a day, keeps you sane. Give yourself a pat on the back");
      }
    }
    if (major.equalsIgnoreCase("humanities")){
      System.out.println("a) You don't even notice them, too busy anticipating the walk up rabb steps");
      System.out.println("b) Help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equalsIgnoreCase("a")) {
        System.out.println("Sounds about right. Get to class!");
      } else if (drinkspill.equalsIgnoreCase("b")){
        System.out.println("Good job! Give yourself a pat on the back");
      } else {
        System.out.println("Not sure about that one. Enter a or b");
      }
    }
      System.out.println();
      promptEnterKey();

    System.out.println();
    if (major.equalsIgnoreCase("humanities")){
      System.out.println("You finally made it up the rabb steps.");
      System.out.println();
      System.out.println("Out of breath, you stumble into class only to find that someone has stolen YOUR seat!");
    }
    if(major.equalsIgnoreCase("stem")){
      System.out.println("You finally made it to gzang.");
      System.out.println();
      System.out.println("Out of breath, you stumble into class only to find that someone has stolen YOUR seat!");
    }
    System.out.println();
    System.out.println("You, an angered and entitled student, are outraged.");
    System.out.println();
    System.out.println("You are class of " + year +", for God's sake. you deserve better" );
    System.out.println();
    System.out.println("What's your next move?");
    System.out.println("a) Approach them and tell them to get out of your seat");
    System.out.println("b) Passive aggressively sit in the seat right next to them");
    System.out.println("c) Skip class.");
    String answer = input.next();
    if (answer.equalsIgnoreCase("a")) {
      System.out.println("power move. class proceeds");
    } else if (answer.equalsIgnoreCase ("b")){
      System.out.println("Good move. Class proceeds");
    } else if (answer.equalsIgnoreCase ("c")) {
      System.out.println("Yikes, now you missed a pop quiz. Whoops! zero for you");
    } else {
      System.out.println("That doesn't sound like a great idea. Enter a, b, or c.");
    }
        System.out.println();
        promptEnterKey();

    System.out.println();
    System.out.println("Class is over! Time to make use of your afternoon. What would you like to do?");
    System.out.println("a) Do some homework");
    System.out.println("b) Go to the gym");
    String afternoon = input.next();
    if (afternoon.equalsIgnoreCase("a")){

    //This was an inner loop that had been working, but stopped when we added our Gym activity with the running times
    //We are keeping it in to show the work.

    /*  System.out.println("Where?");
    //   System.out.println("a) Library");
    //   System.out.println("b) Back to your room in " + residence + ".");
    //   String location = input.next();
    //     if (location.equalsIgnoreCase("a")){
    //     System.out.println("You spend 15 minutes wandering around the library, unable to find a seat");
    //     System.out.println("Looks like you can't work here! Go back to " + residence +" to work.");
    //     System.out.println("You know you wanted to anyway");
    //     System.out.println();
    //   } else if (location.equalsIgnoreCase("b")){
    //     System.out.println("Great choice!");
    //   } else {
    //     System.out.println("Don't do your work there. Enter a or b.");
    //   }
    // }*/


      if (major.equalsIgnoreCase("stem")) {
        System.out.println("Here is your Math homework");
        int numProblems = 10;
        for (int i=1; i<= numProblems; i++){
          System.out.printf("%d) ",i);
          mathQuiz();
          System.out.println("..........................................");
        }
      } else if (major.equalsIgnoreCase("humanities")) {
        System.out.println("Time for spanish homework!");
        spanishHw();
      }
      System.out.println();
      System.out.println("That was productive! Good job.");

    } else if (afternoon.equalsIgnoreCase("b")){
        System.out.println("Do you want to run a mile or a 5k?");
        String p= TextIO.getlnString();
          if (p.equalsIgnoreCase("mile")){
            System.out.println("Enter your desired mile time in minutes");
            int time= TextIO.getlnInt();
            double mph= 60.0/time;
            System.out.printf("To successfully run a mile in %d minutes, you have to run at: %.1f%n",time,mph);
          }else if (p.equalsIgnoreCase("5k")){
            System.out.println("Enter your desired 5k time in minutes: ");
            int time5k= TextIO.getlnInt();
            double speed5k= 3.2/time5k*60;
            System.out.printf("To successfully run a 5k in %d minutes, you have to run at: %.1f%n",time5k,speed5k);
        } else{
          System.out.println("Enter a valid option");
        System.out.println();
      }
    } else {
      System.out.println("You wanna do WHAT?? Just enter a or b");
    }
      System.out.println();
      promptEnterKey();

    System.out.println("Wow, you are so hungry after such a long and hard day as a diligent brandeis student.");
    System.out.println();
    boolean isValid = false;
    String dinner = "";
    while(!isValid)
    {
      System.out.println("What are you thinking for dinner?");
      System.out.println("a) Sherman");
      System.out.println("b) Upper");
      System.out.println("c) Stein");
      System.out.println("d) You've given up and are rich. takeout");
      dinner = input.next();
      if(dinner.equals("a") || dinner.equals("b") || dinner.equals("c") || dinner.equals("d"))
      {
        isValid = true;
      }
      else
      {
        System.out.println("Don’t eat there. Choose a, b, c or d");
      }
    }
    if (dinner.equalsIgnoreCase("a")){
      System.out.println("Nice! Go enjoy a comfortable meal with your friends in a stressful environment.");
      System.out.println("Make sure to check out both sides because there will not be enough options.");
      System.out.println("You will definitely need Tums for this one!");
    } else if (dinner.equalsIgnoreCase("b")){
      System.out.println("Yum!");
    } else if (dinner.equalsIgnoreCase("c")){
      System.out.println("Kick back and get some chicken wings with your pals.");
      System.out.println("Maybe there will be music playing!");
      System.out.println("Don't forget to grab a beer from the bar, but you MUST bring 2 forms of ID");
    } else if (dinner.equalsIgnoreCase("d")){
      System.out.println("By far the best option.");
      System.out.println("Don't put your body through the atrocities of sodexo.");
      System.out.println("Take care of yourself.");
    }

    System.out.println();
    promptEnterKey();
    System.out.println("That was exhausting. Time to kick back and relax for the rest of the evening.");
    System.out.println();
    System.out.println("You definitely don’t have any work you should be doing");
    System.out.println();
    System.out.println("What do you want to do to relax?");
    System.out.println("a) netflix and chill");
    System.out.println("b) game room");
    System.out.println("c) hang out in " + residence + " with friends");
    System.out.println("d) kick back? it's time to sleep.");
    String evening = input.next();
    //String url = "http://www.netflix.com";
    if (evening.equalsIgnoreCase("a")){
      netflixLink();
      System.out.print("Sounds good");
    } else if (evening.equalsIgnoreCase("b")) {
      System.out.println("Good idea!");
      //another game method?
    } else if (evening.equalsIgnoreCase("c")) {
      System.out.println("Have fun!");
    } else if (evening.equalsIgnoreCase("d")) {
      System.out.println("Too true.");
    } else {
      System.out.println("Please enter a, b, c, or d");
    }

    System.out.println();
    promptEnterKey();
    System.out.println("Wow. What a day as a hard working, passionate, and inspired student here at this institution.");
    System.out.println("Can't wait to do the same thing again tomorrow!");
    System.out.println("Goodnight!");
  }

  public static void mathQuiz(){
    Scanner scanner = new Scanner(System.in);
    java.util.Random rand = new java.util.Random();
    int x = rand.nextInt(20);
    int y = rand.nextInt(20);
    int answer = x*y;
    System.out.printf("What is %d * %d? %n",x,y);
    int userAnswer = scanner.nextInt();
    if (userAnswer== answer){
      System.out.println("correct");
    } else {
        System.out.println("incorrect");
    }
  }

  public static void promptEnterKey(){
    System.out.println("Press \"ENTER\" to continue...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
  }

   public static void netflixLink()  {
   try {
   URI uri= new URI("https://www.netflix.com/browse");
   java.awt.Desktop.getDesktop().browse(uri);

   } catch (Exception e) {
    e.printStackTrace();
      }
  }


   public static void spanishHw (){
   System.out.println("Time for Spanish HW \nLet's work on your translations");
   Scanner scan = new Scanner(System.in);
   System.out.println("What does \"¿Hola como estas?\" mean?");
   System.out.println("1)Hey friend \n2)It's Wednesday my dudes \n3)Hello, how are you?");
   int answer1 = scan.nextInt();

   switch(answer1){
       case 1:
           System.out.println("Incorrect");
           break;
       case 2:
           System.out.println("That's a vine reference");
           break;
       case 3:
           System.out.println("Exactamente!");
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
           System.out.println("Exactamente!");
           break;
       case 3:
           System.out.println("Incorrect");
           break;
   }
   System.out.println("What does \"¿Cómo conseguiste esas ronchas? Tienes eczema?\" mean?");
   System.out.println("1) And they were roommates \n2)How'd you get these bumps? You got eczema? \n3)Do you have a pet?");
       int answer3 = scan.nextInt();
   switch(answer3){
       case 1:
           System.out.println("That's a vine reference");
           break;
       case 2:
           System.out.println("Exactamente!");
           break;
       case 3:
           System.out.println("Incorrect");
           break;
   }
  }
 }


