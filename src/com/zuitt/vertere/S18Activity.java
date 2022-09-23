package com.zuitt.vertere;

import java.util.Scanner;

public class S18Activity {
    public static void main(String[] args) {
        //2. declare variables
        String firstName, lastName;
        double firstSubject, secondSubject, thirdSubject;
        //3. instantiate/create a new Scanner object.
        Scanner s18Scanner = new Scanner(System.in);
            //4. Print out messages asking for the user's input and gather them using the Scanner methods.
            System.out.println("First Name:");
            firstName = s18Scanner.nextLine().trim();
            System.out.println("Last Name:");
            lastName = s18Scanner.nextLine().trim();
            System.out.println("First Subject Grade: ");
            firstSubject = s18Scanner.nextDouble();
            System.out.println("Second Subject Grade: ");
            secondSubject = s18Scanner.nextDouble();
            System.out.println("Third Subject Grade: ");
            thirdSubject = s18Scanner.nextDouble();

            //5. Get the average of the user's input and save it in a variable declared as a double.
        double average = Math.round((firstSubject + secondSubject + thirdSubject)/3);
    //6. Print out a message that will display the user's full name and the average grade.
        System.out.println("Good day, " +firstName+ " " +lastName+".");
        System.out.println("Your grade average is : " +average);





    }

}
