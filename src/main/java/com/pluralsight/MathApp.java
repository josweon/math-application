package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        // Question 1:
        System.out.println("~~~Question 1~~~");
        double bobSalary = 76_7676.76, garySalary = 67_6767.67;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2:
        System.out.println("\n~~~Question 2~~~");
        double carPrice = 1.99;
        double truckPrice = 10.99;
        double lowerPrice = Math.min(carPrice, truckPrice);

        System.out.println("The cheaper option would cost you $" + lowerPrice);

        // Question 3:
        System.out.println("\n~~~Question 3~~~");
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius = " + radius + "\n" + "Area = " + area);

        // Question 4:
        System.out.println("\n~~~Question 4~~~");
        double fullNum = 5.0;
        double squareRoot = Math.sqrt(fullNum);

        System.out.println("Square root of " + fullNum + " is " + squareRoot);

        // Question 5:
        System.out.println("\n~~~Question 5~~~");
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.hypot(x2 - x1 ,y2 - y1);
        System.out.println("coord1 = " + "(" + x1 + "," + y1 + ")" + " : coord2 = " + "(" + x2 + "," + y2 + ")");
        System.out.println("Distance = " + distance);

        // Question 6
        System.out.println("\n~~~Question 6~~~");
        float negativeNum = -3.8f;
        float absoluteVal = Math.abs(negativeNum);

        System.out.println("|" + negativeNum + "|" + " = " + absoluteVal);

        // Question 7
        System.out.println("\n~~~Question 7~~~");
        double randomNum = Math.random();
        System.out.println("Rand = " + randomNum);

        // Question 8
        System.out.println("\n~~~BONUS: Question 8~~~");
        int days = 24;
        int hours = days * 24;
        int minutes = hours * 60;
        long milliseconds = minutes * 60 * 1000;

        System.out.println("There are " + minutes + " in " + days + " days.");
        System.out.println("There are " + milliseconds + " in " + days + " days.");

    }
}
