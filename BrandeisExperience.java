import java.util.Scanner;
//import java.net.*;
//import java.io.*;
// import java.awt.Desktop;
// import java.io.IOException;
// import java.net.URI;
// import java.net.URISyntaxException;
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

    System.out.println("First, let's create your profile.");
    System.out.println();

    System.out.println("What is your name?");
    name = TextIO.getln();
    System.out.println("Stem or Humanities?");
    major= TextIO.getln();
    System.out.println("What is your residence hall?");
    residence = TextIO.getln();
    System.out.println("What is your graduating class? ");
    year = TextIO.getln();

    System.out.println();
    System.out.println("Great "+ name +", now let's get started!");
    promptEnterKey();

    System.out.println("Good morning! It is a monday and you have to go to class.");
    System.out.println("What are you eating for breakfast?");
    System.out.println("a.) yogurt in your room");
    System.out.println("b.) einsteins's bagels");
    System.out.println("c.) lower dining hall");
    String breakfast = input.next();
    if (breakfast.equals("a")) {
      System.out.println("great choice.");
    } else if (breakfast.equals ("b")){
      System.out.println("nice! One of the few palatable choices here.");
    } else if (breakfast.equals ("c")) {
      System.out.println("interesting choice, make sure to bring some tums.");
    } else {
      System.out.println("I dont know what breakfast that is. Enter a, b, or c.");
    }

    System.out.println();
    System.out.println("Breakfast time is over, " + name +". Better get on your way or you will be late");
    System.out.println();
    promptEnterKey();
    System.out.println("whoops! on your way to class you bumped into someone and spilled their drink");
    System.out.println("What do you do?");

    if (major.equalsIgnoreCase("stem")) {
      System.out.println("a.) Ugh, I'm a premed, I dont have time for this. Out of my way, I'm late for my 8am");
      System.out.println("b.) help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equals("a")) {
        System.out.println("sounds about right. Get to class!");
      } else if (drinkspill.equals ("b")){
        System.out.println("good job! Give yourself a pat on the back");
      }
    }
    if (major.equalsIgnoreCase("humanities")){
      System.out.println("a.) you don't even notice them, too busy aniticpating the walk up rabb steps");
      System.out.println("b.) help them like the compassionate and caring deisian you are");
      String drinkspill = input.next();
      if (drinkspill.equalsIgnoreCase("a")) {
        System.out.println("sounds about right. Get to class!");
      } else if (drinkspill.equalsIgnoreCase("b")){
        System.out.println("good job! Give yourself a pat on the back");
      } else {
        System.out.println("not sure about that one. Enter a or b");
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
    System.out.println("you, an angered and entitled student, are outraged.");
    System.out.println();
    System.out.println("You are class of " + year +", for God's sake. you deserve better" );
    System.out.println();
    System.out.println("What's your next move?");
    System.out.println("a.) approach them and tell them to get out of your seat");
    System.out.println("b.) passive aggressively sit in the seat right next to them");
    System.out.println("c.) skip class.");
    String answer = input.next();
    if (answer.equalsIgnoreCase("a")) {
      System.out.println("power move. class proceeds");
    } else if (answer.equalsIgnoreCase ("b")){
      System.out.println("good move. class proceeds");
    } else if (answer.equalsIgnoreCase ("c")) {
      System.out.println("yikes, now you missed a pop quiz. whoops! zero for you");
    } else {
      System.out.println("That doesn't sound like a great idea. Enter a, b, or c.");
    }
        System.out.println();
        promptEnterKey();

    System.out.println();
    System.out.println("Class is over! time to make use of your afternoon. what would you like to do?");
    System.out.println("a. Do some homework");
    System.out.println("b. go to the gym");
    String afternoon = input.next();
    if (afternoon.equalsIgnoreCase("a")){

    //
    //   System.out.println("where?");
    //   System.out.println("a.) library");
    //   System.out.println("b.) back to your room in " + residence + ".");
    //   String location = input.next();
    //     if (location.equalsIgnoreCase("a")){
    //     System.out.println("You spend 15 minutes wandering aorund the library, unable to find a seat");
    //     System.out.println("Looks like you can't work here! Go back to " + residence +" to work.");
    //     System.out.println("You know you wanted to anyway");
    //     System.out.println();
    //   } else if (location.equalsIgnoreCase("b")){
    //     System.out.println("great choice");
    //   } else {
    //     System.out.println("Don't do your work there. Enter a or b.");
    //   }
    // //}


      if (major.equalsIgnoreCase("stem")) {
        System.out.println("here is your math homework");
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
      System.out.println("You wanna do WHAT?? just enter a or b");
    }
      System.out.println();
      promptEnterKey();

    System.out.println("wow, you are so hungry after such a long and hard day as a diligent brandeis student.");
    System.out.println();
    boolean isValid = false;
    String dinner = "";
    while(!isValid)
    {
      System.out.println("What are you thinking for dinner?");
      System.out.println("a.) Sherman");
      System.out.println("b.) Upper");
      System.out.println("c.) Stein");
      System.out.println("d.) You've given up and are rich. takeout");
      dinner = input.next();
      if(dinner.equals("a") || dinner.equals("b") || dinner.equals("c") || dinner.equals("d"))
      {
        isValid = true;
      }
      else
      {
        System.out.println("Dont eat there. Choose a, b, c or d");
      }
    }
    if (dinner.equalsIgnoreCase("a")){
      System.out.println("nice! go enjoy a comfortable meal with your friends in a stressful environment.");
      System.out.println("make sure to check out both sides because there will not be enough options.");
      System.out.println("you will definitely need tums for this one.");
    } else if (dinner.equalsIgnoreCase("b")){
      System.out.println("yum!");
    } else if (dinner.equalsIgnoreCase("c")){
      System.out.println("kick back and get some chicken wings with your pals.");
      System.out.println("maybe there will be music playing!");
      System.out.println("dont forget to grab a beer form the bar, but you MUST bring 2 forms of ID");
    } else if (dinner.equalsIgnoreCase("d")){
      System.out.println("by far the best option.");
      System.out.println("dont put your body through the atrocities of sodexo.");
      System.out.println("take care of yourself.");
    }

    System.out.println();
    promptEnterKey();
    System.out.println("that was exhausting. time to kick back and relax for the rest of the evening.");
    System.out.println();
    System.out.println("you definitely dont have any work you should be doing");
    System.out.println();
    System.out.println("what do you want to do to relax?");
    System.out.println("a.) netflix and chill");
    System.out.println("b.) game room");
    System.out.println("c.) hang out in " + residence + " with friends");
    System.out.println("d.) kick back? its time to sleep.");
    String evening = input.next();
    //String url = "http://www.netflix.com";
    if (evening.equalsIgnoreCase("a")){
      // String urlString = "http://localhost:8080/";
      // URL url = new URL(urlString);
      // BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      // String line;
      // while ((line = reader.readLine()) != null){
      //   System.out.println(line);
      // }
      // reader.close();
      System.out.print("sounds good");
    } else if (evening.equalsIgnoreCase("b")) {
      System.out.println("good idea!");
      //another game method?
    } else if (evening.equalsIgnoreCase("c")) {
      System.out.println("have fun!");
    } else if (evening.equalsIgnoreCase("d")) {
      System.out.println("too true.");
    } else {
      System.out.println("please enter a, b, c, or d");
    }

    System.out.println();
    promptEnterKey();
    System.out.println("wow. what a day as a hard working, passionate, and inspired student here at this insitution.");
    System.out.println("cant wait to do the same thing again tomorrow!");
    System.out.println("goodnight!");


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

     public static void spanishHw (){
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
