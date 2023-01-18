/**********************************************************
 @file MyExtendedplayerBio.java
 @brief This program is an extension file from our base class
 which contain all the methods and variables that deal with the
 physical and talent attributes of our players (objects)
 @author Joshua Sosanya, Wesley Stroebel
 @date 11/28/22
 ************************************************************/
import java.util.Scanner;
public class MyExtendedplayerBio extends MyBasePlayerBio {

    private int speed; //Private int variables that will be used in this class to help calculate the overall
    private int jump;
    private int acceleration;
    private int strength;
    private int threePoint;
    private int midRange;
    private int layup;
    private int dunk;
    private int handles;
    private int pass;
    private int IQ;
    private int defense;



     private int Overall;

    public MyExtendedplayerBio () {//Default Constructor that initializes all variables to 0
        speed = 0;
        jump = 0;
        acceleration = 0;
        strength = 0;
        threePoint = 0;
        midRange = 0;
        layup = 0;
        dunk = 0;
        handles = 0;
        pass = 0;
        IQ = 0;
        defense = 0;
    }

        public MyExtendedplayerBio(int speed, int strength, int jump, int acceleration, int threePoint, int midRange, int layup, int dunk, int handles, int pass, int IQ, int defense)//Fully loaded constructor that will set variables to entered values
        {
            this.speed = speed;
            this.jump = jump;
            this.acceleration = acceleration;
            this.threePoint = threePoint;
            this.midRange = midRange;
            this.layup = layup;
            this.dunk = dunk;
            this.handles = handles;
            this.pass = pass;
            this.IQ = IQ;
            this.defense = defense;
            this.strength = strength;
        }

        public void setIQ(Scanner scnr){this.IQ = scnr.nextInt();} //Lines 59 through 94 are the set methods for variables in class

    public void setDefense(Scanner scnr){
        this.defense = scnr.nextInt();
    }
        public void setSpeed(Scanner scnr){
        this.speed = scnr.nextInt();
        }
        public void setJump(Scanner scnr){
        this.jump = scnr.nextInt();
        }
        public void setAcceleration(Scanner scnr) {
            this.acceleration = scnr.nextInt();
        }
        public void setThreePoint(Scanner scnr){
        this.threePoint = scnr.nextInt();
        }
        public void setMidRange(Scanner scnr){
        this.midRange = scnr.nextInt();
        }


    public void setLayup(Scanner scnr) {
            this.layup = scnr.nextInt();
        }
        public void setDunk(Scanner scnr){
        this.dunk = scnr.nextInt();
    }
    public void setHandles(Scanner scnr){
        this.handles = scnr.nextInt();
    }
    public void setPass(Scanner scnr){
        this.pass = scnr.nextInt();
    }

    public void setStrength(Scanner scnr){this.strength = scnr.nextInt();}
        public int getSpeed()
        {
            return speed;
        }//Lines95 through 141 are set methods for the variables in the class
    public int getJump()
    {
        return jump;
    }
    public int getAcceleration()
    {
        return acceleration;
    }
    public int getThreePoint()
    {
        return threePoint;
    }
    public int getMidRange()
    {
        return midRange;
    }
    public int getLayup()
    {
        return layup;
    }
    public int getDunk()
    {
        return dunk;
    }
    public int getHandles()
    {
        return handles;
    }
    public int getPass()
    {
        return pass;
    }

    public int getDefense()
    {
        return defense;
    }

    public int getIQ(){
        return IQ;
    }

    public int getStrength(){
        return strength;
    }
    public String experienceFinder ()//Method that finds the experience of the player
    {
        if(super.getAge() >=26) {//If statement checks the age of player and will set experience to a word and that is returned
            experience = "Veteran";}
        else if (super.age <= 25) {
            experience = "Rookie";}
        else {
            experience = "Super Vet";}
        return experience;}
    public int Overall(){//Method that adds together all the variables and will divide them by 12 to get the overall rating
        Overall = ((speed + jump + acceleration + threePoint + midRange + layup + dunk + handles + pass + IQ + defense + strength) / 12);
        return Overall;}
    public String playerProjection() {//Method to project what type of player they will be
        String proj;
        if(Overall>=90) {//If statement checks overall and will return string based on overall value
            proj = "Hall of fame";}
        else if(Overall<=89 && Overall>=80) {
            proj = "All Star";}
        else if(Overall<=79 && Overall>=70) {
           proj = "Impact";}
        else {
            proj = "Role";}
        return proj;}
    public void printPlayerExtraInfo(){//Method that prints the player info that will include variables and methods
        System.out.println(firstName + " " + lastName + " is a " + Overall() + " overall and is projected to be a " + playerProjection() + " player this season");
    }


}
