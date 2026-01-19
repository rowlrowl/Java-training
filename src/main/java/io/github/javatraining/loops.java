package io.github.javatraining;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        while(number<=0){
            System.out.println("Invalid, enter positive number");
            number=scanner.nextInt();
        }
    System.out.println("Thank you, you have entered positive number");
    }

}
