package io.github.javatraining;

import java.util.Scanner;

public class continueAndBreak {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        int sum=0;
        int count=0;
        do{
            System.out.println("Enter a Number (0 to stop): ");
            number=scanner.nextInt();
            if(number==0){
                break;
            }
            else if(number<0){
                System.out.println("Negative numbers are ignored");
                continue;
            }
            sum+=number;
            count++;

        }while(number!=0);
        if(count>0){
            System.out.println("Sum is: "+sum);
            System.out.println("Count is "+count);
            double average=sum/count;
            System.out.println("Average is "+ average);

        }else{
            System.out.println("No Valid Numbers Entered");
        }
        
        
    }

}
