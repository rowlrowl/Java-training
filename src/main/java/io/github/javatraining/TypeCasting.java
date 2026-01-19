package io.github.javatraining;

public class TypeCasting {
    public static void main(String[] args){

        int myInt=10;
        double myDouble=myInt;
        System.out.println("Typecasted from int to double " + myDouble);

        double double2=9.78;
        int int2=(int)double2;
        System.out.println(int2);

        String numberString="123";
        int parsedInt = Integer.parseInt(numberString);
        double parsedDouble = Double.parseDouble("45.67");

        System.out.println("parsedInt "+ parsedInt);
        System.out.println("parsedDouble " + parsedDouble);
    }

}
