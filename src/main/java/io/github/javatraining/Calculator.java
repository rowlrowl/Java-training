package io.github.javatraining;
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the second number");
        double secondNumber=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter operation to perform (+,-,*,/,%)");
        String operation=scanner.nextLine();

        var result=switch(operation){
            case "+" -> firstNumber+secondNumber;
            case "-" -> firstNumber-secondNumber;
            case "*" -> firstNumber*secondNumber;
            case "/" -> {
                if(secondNumber==0){
                    yield "null";
                }
                else{
                    yield firstNumber/secondNumber;
                }
            }
            case "%" -> firstNumber%secondNumber;
            default ->"Unrecognized";

        };

        if(result=="null"){
            System.out.println("Can't divide by zero");
        }else if(result=="Unrecognized"){
            System.out.println("Error: Could not perform the operation");
        }else{
            System.out.println("The result is "+result);

        }
        scanner.close();
        


    }

}
