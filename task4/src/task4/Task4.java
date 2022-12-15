//remove comma from string if there is any 
package task4;
import java.util.Scanner;

public class Task4 {

   public static void main(String[] args) {
          System.out.println("plase enter statment :");
        System.out.println("");
        Scanner input = new Scanner(System.in); 
        String a = input.nextLine(); // user will input a string 
        String new_statment = ""; 
        //sccessing char by char in the string searching for a comma 
        for (int i = 0; i < a.length(); ++i) {
            char charcter = a.charAt(i);
            // check if the char is comma or not 
            if (charcter != ',') {
                new_statment = new_statment + charcter;// remove the comma if found 

            }

        }
        System.out.print(" the ststment without comma:  ");//print the string after removing the comma 
        System.out.println(new_statment);

    }
    
}
