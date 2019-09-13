/***
 * A class for manipulating strings so that they are properly capitalized.
 *
 * @author Abigail Marsh, Fall 2019
 */

package stringPractice;

import java.util.Scanner;

public class UppercaseFirstLetter {

    /***
     * A method for converting the first letter of a string to uppercase.
     * TODO: Implement this method
     *
     * @param input A string to be modified
     * @return The input string, but with the first letter now capitalized
     */
    public static String uppercaseFirstLetter(String input) {
        int len = input.length();
        if (len == 0) {
            return input;
        }
        else {
            String capital = input.substring(0, 1);
            input = input.substring(1, len);
            return capital.toUpperCase() + input;
        }
    }

    /***
     * Run this program to test your method on different input strings
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something you would like to modify: ");

        String input = scan.nextLine();

        System.out.println(uppercaseFirstLetter(input));
    }
}
