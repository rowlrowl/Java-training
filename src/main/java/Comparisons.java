public class Comparisons {

    public static void main(String[] args){
        boolean isSunny=true;
        boolean isWeekend=false;
        int temperature=15;

        System.out.println("Good weather: " + (isSunny && temperature > 20));
        System.out.println("Outdoor day: "  + (isSunny || temperature > 20));
        System.out.println("Is it sunny? : "+ !isSunny);

    }
}
