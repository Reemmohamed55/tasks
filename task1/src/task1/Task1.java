// get the char for an ascii integer value 
package task1;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
         System.out.println("eter ascii code");
        // type casting to convert the integer number to char , user will enter the ascii integer value 
         char convert = (char) read.nextInt(); 
        System.out.println("the ascii code is : "+convert); // system will print the char for ascii value 
    }
    

}
