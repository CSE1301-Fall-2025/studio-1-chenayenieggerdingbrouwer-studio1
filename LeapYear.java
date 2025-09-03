import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a year");
        int leapYear = in.nextInt();


        boolean isleapYear;

        if (((leapYear % 4 == 0) && (leapYear % 100 != 0)) || (leapYear % 400 == 0)){
            isleapYear = true;
        }
        else{
            isleapYear = false;
        }

        System.out.println( leapYear + " is a leap year: " + isleapYear);


}
}