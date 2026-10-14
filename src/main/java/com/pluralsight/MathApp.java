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

    }
}
