package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        double bobSalary = 76_7676.76, garySalary = 67_6767.67;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);
    }
}
