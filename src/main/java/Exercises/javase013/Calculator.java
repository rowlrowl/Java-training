package Exercises.javase013;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        

        while(true){
        System.out.println("Enter the operation you wish to perform");
        System.out.println("1. Addition\n2. Subtraction\n3: Multiplication\n4. Division\n5. Exit");
        int inputNumber=scanner.nextInt();
        scanner.nextLine();
        if(inputNumber==5){
            break;
        }
        
        while(inputNumber<1 || inputNumber>4){
            System.out.println("Please enter a valid number");
            inputNumber=scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Enter the two numbers to perform the operation on");
        String firstInput=scanner.nextLine();
        String secondInput=scanner.nextLine();
        
        try{
            checkIfEmpty(firstInput);
            checkIfEmpty(secondInput);
        }catch(InvalidOptionException e){
            System.out.println("Number cannot be blank");
        }
       
        
        try{
            double firstNumber=Double.parseDouble(firstInput);
            double secondNumber=Double.parseDouble(secondInput);
            
            switch(inputNumber){
                case 1:
                    add(firstNumber,secondNumber);
                    break;
                case 2:
                    substract(firstNumber, secondNumber);
                    break;
                case 3:
                    multiply(firstNumber, secondNumber);
                    break;
                case 4:
                    divider(firstNumber, secondNumber);
                    break;
                
                    
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid number");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }finally{
            System.out.println("=================================================");
        }
        

        }

        

        
        
    }
    public static void add(double a, double b){
        System.out.println("Adding "+a+" and "+b);
        double result=a+b;
        System.out.println("Result is "+result);

    }
    public static void substract(double a, double b){
        
        System.out.println("Subtracting "+b+" from "+a);
        double result=a-b;
        System.out.println("Result is "+result);


    }
    public static void multiply(double a, double b){
        System.out.println("Multiplying "+a+" and "+b);
        double result=a*b;
        System.out.println("Result is "+result);
    }
    public static void divider(double a, double b){
        
        System.out.println("Dividing "+a+" by "+b);
        double result=a/b;
        System.out.println("Result is "+result);
        

    }
    public static void checkIfEmpty(String input){
        if(input.trim().isEmpty()){
            
            throw new InvalidOptionException("Empty Number");
        }
        
    }

}
