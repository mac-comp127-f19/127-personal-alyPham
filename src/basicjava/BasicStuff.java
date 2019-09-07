package basicjava;

/**
 * Created by alyPham on 9/6/19.
 */

public class BasicStuff {
    public static void main(String[] args) {
//        int age0 = 19;
//        int age1 = 20;
//        int sumOfAges = age0 + age1;
        double age0 = 19;
        double age1 = 20;
        double sumOfAges = age0 + age1;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
        //A possible mistake a programmer might make in regards to printing the sum would be the absence of the
        //parentheses and having it print 1920.

        System.out.println(6/3);
        System.out.println(6/4);
        //To evaluate to 1.5, one could change either 6 or 4 to float values.

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //What is printed is the highest/lowest value able to be represented given the amount of memory space allotted
        //to that numeric type (int).
        System.out.println(Integer.MIN_VALUE-1);
        //Underflow...

        int setHours = 1600;
        int weeks = (setHours/24)/7;
        int days = (setHours - (weeks*7*24))/24;
        int hours = (setHours - (weeks*7*24)- (days*24));
        System.out.println("In " + setHours + ", there is " + weeks + " weeks, " + days + ", days, and " + hours +
                " hours.");

       double h = 5;
       double r = 2;
       double V = (1.0/3.0) * Math.PI * (r*r) * h;
       double A = (Math.PI * (r*r)) + (Math.PI * r * Math.sqrt((r*r + h*h)));
       System.out.println("Cone Volume = " + V);
       System.out.println("Cone Surface Area = " + A);
    }
}
