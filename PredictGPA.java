/*
@PredictGPA.java
@This program is a GPA calculator, it will ask the user for the number of hours per class
and also take in the grade they are expecting for each class. I then use if statments to
gather the users info and compute there GPA.
@Joshua Sosanya
@ 9/8/22
 */


import java.util.Scanner;

public class PredictGPA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hoursClass1;
        int hoursClass2;
        int hoursClass3;
        int hoursClass4;

        String expGrd1;
        String expGrd2;
        String expGrd3;
        String expGrd4;

        System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester.");

        System.out.println("Course 1: Number of hours?");
        hoursClass1 = scnr.nextInt();
        System.out.print("Course 1: Expected grade?");
        expGrd1 = scnr.next();
        System.out.println();

        System.out.println("Course 2: Number of hours?");
        hoursClass2 = scnr.nextInt();
        System.out.print("Course 2: Expected grade?");
        expGrd2 = scnr.next();
        System.out.println();

        System.out.println("Course 3: Number of hours?");
        hoursClass3 = scnr.nextInt();
        System.out.print("Course 3: Expected grade?");
        expGrd3 = scnr.next();
        System.out.println();

        System.out.println("Course 4: Number of hours?");
        hoursClass4 = scnr.nextInt();
        System.out.print("Course 4: Expected grade?");
        expGrd4 = scnr.next();
        System.out.println();

        double gradeV1 = 0;
        double gradeV2 = 0;
        double gradeV3 = 0;
        double gradeV4 = 0;

        if (expGrd1.equals("A")){
            gradeV1 = 4.00;}
        else if (expGrd1.equals("A-")){
            gradeV1 = 3.67;}
        else if (expGrd1.equals("B+")){
            gradeV1 = 3.33;}
        else if (expGrd1.equals("B")){
            gradeV1 = 3.00;}
        else if (expGrd1.equals("B-")){
            gradeV1 = 2.67;}
        else if (expGrd1.equals("C+")){
            gradeV1 = 2.33;}
        else if (expGrd1.equals("C")){
            gradeV1 = 2.00;}
        else if (expGrd1.equals("C-")){
            gradeV1 = 1.67;}
        else if (expGrd1.equals("D+")){
            gradeV1 = 1.33;}
        else if (expGrd1.equals("D")){
            gradeV1 = 1.00;}
        else if (expGrd1.equals("F")){
            gradeV1 = 0.00;}
        else {
            System.out.println("Invalid Grade");
        }
        if (expGrd2.equals("A")){
            gradeV2 = 4.00;}
        else if (expGrd2.equals("A-")){
            gradeV2 = 3.67;}
        else if (expGrd2.equals("B+")){
            gradeV2 = 3.33;}
        else if (expGrd2.equals("B")){
            gradeV2 = 3.00;}
        else if (expGrd2.equals("B-")){
            gradeV2 = 2.67;}
        else if (expGrd2.equals("C+")){
            gradeV2 = 2.33;}
        else if (expGrd2.equals("C")){
            gradeV2 = 2.00;}
        else if (expGrd2.equals("C-")){
            gradeV2 = 1.67;}
        else if (expGrd2.equals("D+")){
            gradeV2 = 1.33;}
        else if (expGrd2.equals("D")){
            gradeV2 = 1.00;}
        else if (expGrd2.equals("F")){
            gradeV2 = 0.00;}
        else {
            System.out.println("Invalid Grade");}

        if (expGrd3.equals("A")){
            gradeV3 = 4.00;}
        else if (expGrd3.equals("A-")){
            gradeV3 = 3.67;}
        else if (expGrd3.equals("B+")){
            gradeV3 = 3.33;}
        else if (expGrd3.equals("B")){
            gradeV3 = 3.00;}
        else if (expGrd3.equals("B-")){
            gradeV3 = 2.67;}
        else if (expGrd3.equals("C+")){
            gradeV3 = 2.33;}
        else if (expGrd3.equals("C")){
            gradeV3 = 2.00;}
        else if (expGrd3.equals("C-")){
            gradeV3 = 1.67;}
        else if (expGrd3.equals("D+")){
            gradeV3 = 1.33;}
        else if (expGrd3.equals("D")){
            gradeV3 = 1.00;}
        else if (expGrd3.equals("F")){
            gradeV3 = 0.00;}
        else {
            System.out.println("Invalid Grade");}

        if (expGrd4.equals("A")){
            gradeV4 = 4.00;}
        else if (expGrd4.equals("A-")){
            gradeV4 = 3.67;}
        else if (expGrd4.equals("B+")){
            gradeV4 = 3.33;}
        else if (expGrd4.equals("B")){
            gradeV4 = 3.00;}
        else if (expGrd4.equals("B-")){
            gradeV4 = 2.67;}
        else if (expGrd4.equals("C+")){
            gradeV4 = 2.33;}
        else if (expGrd4.equals("C")){
            gradeV4 = 2.00;}
        else if (expGrd4.equals("C-")){
            gradeV4 = 1.67;}
        else if (expGrd4.equals("D+")){
            gradeV4 = 1.33;}
        else if (expGrd4.equals("D")){
            gradeV4 = 1.00;}
        else if (expGrd4.equals("F")){
            gradeV4 = 0.00;}
        else {
            System.out.println("Invalid Grade");}

        double GPA;
        int totalHours;

        totalHours = hoursClass1 + hoursClass2 + hoursClass3 + hoursClass4;
        GPA = ((gradeV1 * hoursClass1) + (gradeV2 * hoursClass2) + (gradeV3 * hoursClass3) + (gradeV4 * hoursClass4)) / totalHours;

        System.out.println("Your semester GPA would be:"  + GPA);

    }
}
