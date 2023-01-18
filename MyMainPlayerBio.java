/**********************************************************
 @file MyMainPlayerBio.java
 @brief This program is our main class that will call and create
 objects using our base and extended classes. The code will take
 in the users input of its required variables and help generate the
 methods throughout our code.
 @author Joshua Sosanya, Wesley Stroebel
 @date 11/28/22
 ************************************************************/
import java.util.Scanner;
public class MyMainPlayerBio {

    public static void main(String[] args) {
        //Vraiables needed in the main
        String userName;
        String firstName;
         String lastName;
         String position;
         float height;
        float weight;
         int age;
         String hometown;
         int speed;
        int jump;
        int acceleration;
         int strength;
         int threePoint;
        int midRange;
        int layup;
        int dunk;
        int handles;
       int pass;
        int IQ;
        int defense;

        Scanner scnr = new Scanner(System.in);//Scanner is created and will be used many times
        MyExtendedplayerBio [] players = new MyExtendedplayerBio [4];//Array created so the user can create five players

        System.out.println("Welcome to NBA compsci 23!!");//Lines 19 through 23 is just getitng more user info from scanner
        System.out.println("What is your name?");
        userName = scnr.nextLine();
        System.out.println("Coach " + userName + "!" + "\n" + "Please create your 5 player starting lineup!");
        System.out.println();


        System.out.println("What is this players first name?");
        firstName=scnr.nextLine();



        System.out.println("What is " + firstName + " last name?");
        lastName= scnr.nextLine();

        System.out.println("What is " + firstName + " " + lastName + " position?");
        position= scnr.nextLine();

        System.out.println("What is " + firstName + " " + lastName + " height? (in inches)");
        height= scnr.nextInt();

        System.out.println("What is " + firstName + " " + lastName + " weight?");
        weight= scnr.nextInt();

        System.out.println("What is " + firstName + " " + lastName + " age?");
        age= scnr.nextInt();

       System.out.println("What is " + firstName + " " + lastName + " hometown?");
        hometown= scnr.nextLine();

        MyBasePlayerBio player1 =new MyBasePlayerBio(firstName,lastName,position,height,weight,age,hometown);//First fully loaded constructor that is for the first player

        System.out.println();
        System.out.println("Now you can customize this players skills and athleticism" + "\n" + "please enter these attributes on a scale from 0 - 99#");
        System.out.println();

        System.out.println("What do you rate " + firstName + " " + lastName + " speed?");
        speed=scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " strength");
       strength=scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " jump?");
        jump=scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " acceleration?");
        acceleration= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " 3 point shot?");
        threePoint= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " midrange shot?");
        midRange= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " layup shot?");
        layup= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " dunk shot?");
        dunk= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " handles?");
        handles = scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " passing?");
        pass = scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " IQ?");
        IQ= scnr.nextInt();

        System.out.println("What do you rate " + firstName + " " + lastName + " defense?");
        defense= scnr.nextInt();   // Start of the fully loaded constuctor for attributes for the first player
        MyExtendedplayerBio player1Attributes = new MyExtendedplayerBio(speed,strength,jump,acceleration,threePoint,midRange,layup,dunk,handles,pass,IQ,defense);
        player1.printPlayerInfo(); //Methods that are called to print stuff for the first player
        player1Attributes.printPlayerExtraInfo();
        player1.salaryFinder();
        player1.Size();













        for (int i = 0; i < 4; i++)//For loop that will allow user to create five players
        {
            players[i] = new MyExtendedplayerBio();//Object is created and will be added to array so we can use methods and variables from other classes

            System.out.println("What is this players first name?");//Lines 31 through 90 will ask the user for a rating and that rating will be stored in object
            players[i].setFirstName(scnr);

            System.out.println("What is " + players[i].firstName + " last name?");
            players[i].setLastName(scnr);

            System.out.println("What is " + players[i].firstName + " " + players[i].lastName + " position?");
            players[i].setPosition(scnr);

            System.out.println("What is " + players[i].firstName + " " + players[i].lastName + " height? (in inches)");
            players[i].setHeight(scnr);

            System.out.println("What is " + players[i].firstName + " " + players[i].lastName + " weight?");
            players[i].setWeight(scnr);

            System.out.println("What is " + players[i].firstName + " " + players[i].lastName + " age?");
            players[i].setAge(scnr);

            System.out.println("What is " + players[i].firstName + " " + players[i].lastName + " hometown?");
            players[i].setHomeTown(scnr);

            System.out.println();
            System.out.println("Now you can customize this players skills and athleticism" + "\n" + "please enter these attributes on a scale from 0 - 99#");
            System.out.println();

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " speed?");
            players[i].setSpeed(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " strength");
            players[i].setStrength(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " jump?");
            players[i].setJump(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " acceleration?");
            players[i].setAcceleration(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " 3 point shot?");
            players[i].setThreePoint(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " midrange shot?");
            players[i].setMidRange(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " layup shot?");
            players[i].setLayup(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " dunk shot?");
            players[i].setDunk(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " handles?");
            players[i].setHandles(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " passing?");
            players[i].setPass(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " IQ?");
            players[i].setIQ(scnr);

            System.out.println("What do you rate " + players[i].firstName + " " + players[i].lastName + " defense?");
            players[i].setDefense(scnr);

            players[i].printPlayerInfo();//Final methods that will print the results for the players for what the user entered
            players[i].printPlayerExtraInfo();
            players[i].salaryFinder();
            players[i].Size();

            System.out.println();

        }
        System.out.println("Great job making this starting line up Coach "+ userName + "!" + "\n" + "Good luck this season!");
    }
}