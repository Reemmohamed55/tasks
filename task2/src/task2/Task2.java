//get ncr and npr
package task2;
import java.util.Scanner;


public class Task2 {

      public static void main(String[] args) {
        
        
        int nCr, nPr;
        System.out.println("please enter two number x AND y :");
        Scanner input = new Scanner(System.in);
        //user will input two values of n and r 
        int x = input.nextInt();
        int y = input.nextInt();
        int z = 1;
        // calculate the factorial of (n)
        for (int i = 1; i <= x; i++) {
            z = z * i;
        }
        int w = 1;
        // calculate the factorial of (n-r)
        for (int i = 1; i <= (x - y); i++) {
            w = w * i;
        }
        int c = 1;
        //calculate the factorial of (r)
        for (int i = 1; i <= (y); i++) {
            c = c * i;
        }
        nCr = z / (w * c); //combination =  factorial(n)/(factorial(n-r) * factorial(r))
        nPr = z / w;      // permutation = factorial(n) / factorial(n-r)
        //print both the values of ncr and npr
        System.out.println("THE VALUE OF (nCr)Combination IS : " + nCr);
        System.out.println("THE VALUE OF (nPr)Permutation IS : " + nPr);
        System.out.println("END OF PROCESS");

    }

    
}
