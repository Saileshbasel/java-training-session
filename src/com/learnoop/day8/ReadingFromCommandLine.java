package com.learnoop.day8;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReadingFromCommandLine {

    public static void main(String[] args) {
        double marksTotal = 400;
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name = in.nextLine();
        Logger.getGlobal().info(name);

        System.out.println("Please Enter your Roll Number: ");
        int rollNumber = in.nextInt();
        Logger.getGlobal().info(String.valueOf(rollNumber));

        System.out.println("Please Enter your marks in Maths: ");
        double marksMath = in.nextDouble();

        System.out.println("Please Enter your marks in Science: ");
        double marksScience = in.nextDouble();

        System.out.println("Please Enter your marks in English: ");
        double marksEnglish = in.nextDouble();

        System.out.println("Please Enter your marks in CS: ");
        double marksCS = in.nextDouble();

        double marksObtained = marksMath + marksScience + marksEnglish + marksCS;
        double totalPercentage = (marksObtained / marksTotal)*100;
        Logger.getGlobal().info(String.valueOf(totalPercentage));
    }
}
