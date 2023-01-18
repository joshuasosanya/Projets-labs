/**********************************************************
 @file MyBasePlayerBio.java
 @brief This program is our base file which holds all of the
 generic information of each of the players (objects)
 @author Joshua Sosanya, Wesley Stroebel
 @date 11/28/22
 ************************************************************/
import java.util.Scanner;
public class MyBasePlayerBio {

    protected String firstName;      //These are the field variables for the base class
    protected String lastName;
    protected String position;
    protected float height;
    protected float weight;
    protected int age;
    protected String hometown;
    protected String experience;
    protected String jerseySize;
    protected String salary;
    protected String nameSalary;


    public MyBasePlayerBio (){   //defualt constructor
        firstName = "unknown";
        lastName = "unknown";
        position = "unknown";
        height = 0;
        weight = 0;
        age = 0;
        hometown = "unknown";
    }
    public MyBasePlayerBio(String firstName, String lastName, int age, String hometown) {  //loaded constructor
        this.firstName = firstName;
        this.lastName = lastName;
        position = "unknown";
        height = 0;
        weight = 0;
        this.age = age;
        this.hometown = hometown;
    }
    public MyBasePlayerBio(String firstName, String lastName, String position, float height, float weight, int age, String hometown){ //fully loaded constuctor
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.hometown = hometown;
    }

    public void setFirstName(Scanner scnr) {
        this.firstName = scnr.next();
    }  // Start of our set methods
    public void setLastName(Scanner scnr) {
        this.lastName = scnr.next();
    }
    public void setPosition(Scanner scnr) {
        this.position = scnr.next();
    }
    public void setHeight(Scanner scnr) {
        this.height = scnr.nextFloat();
    }
    public void setWeight(Scanner scnr) {
        this.weight = scnr.nextFloat();
    }
    public void setAge(Scanner scnr) {
        this.age = scnr.nextInt();
    }
    public void setHomeTown(Scanner scnr) {
        this.hometown = scnr.next();
    }

    public String getFirstName(){
        return firstName;
    }     //Start of our get methods
    public String getLastName(){
        return lastName;
    }
    public String getPosition() {
        return position;
    }
    public float getHeight() {
        return height;
    }
    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
    public String getHomeTown() {
        return hometown;
    }

    public void Size(){            //Method that sets jersey size
        if (weight <= 200){
            jerseySize = "L";
        }
        else if (weight >= 201 || weight <= 230) {
            jerseySize = "XL";
        }
        else if (weight >= 231 || weight <= 260) {
            jerseySize = "XXL";
        }
        else if (weight >= 261){
            jerseySize = "XXXL";
        }
        System.out.println(firstName + " " + lastName + " would need to wear a " + jerseySize + " jersey.");
    }

    public String experienceFinder ()   //methods that set the experience
    {
        if(age>=26)
        {
            experience = "Veteran";
        }
        else
        {
            experience = "Rookie";
        }
        return experience;


    }

    public void salaryFinder() {                  //method that sets the salary
        nameSalary = experienceFinder();
        if (nameSalary.equals("Veteran"))
        {
            salary= "$350,000";
        }
        else {
            salary="$150,000";
        }
        System.out.println(getFirstName() + " " + getLastName() + " is can be considered a " + experience + ", and should have a salary of at least " + salary +".");
    }

    public void printPlayerInfo(){   //Method that prints the base info of each playert.
        System.out.println( "Name: " + getFirstName() + " " + getLastName() + "\n" + "Position: " + getPosition() + "\n"  +"Height: " + getHeight() + " inches" + "\n" +"Weight: " + getWeight() + " pounds" + "\n" + "HomeTown: " + getHomeTown());
        System.out.println("------------------------------");

    }



}
