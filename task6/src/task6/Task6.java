//get the area and perimeter of both circle and rectangle in two diffrent classes 
package task6;
import java.util.*;


public class Task6 {
    public static void main(String[] args) {
      circle cir = new circle ();// make obj from class circle
      System.out.println("enter the radius of the circle:");
      Scanner in = new Scanner (System.in);// user input the radius 
      double radius =in.nextDouble();
      System.out.println("the area is  "+cir.area(radius));//call method area to calculate area 
      System.out.println("the perimeter is  "+cir.perimeter(radius)); // call method perimeter to calculate perimetr 
      
      System.out.println("enter the three diminsions of the triangle and the hight:");
      //user input the paramters needed to be passed to tri methods 
      double a=in.nextDouble();
      double b=in.nextDouble();
      double c=in.nextDouble();
      double h=in.nextDouble();
      triangle tri= new triangle();
      //print both area and perimeter 
      System.out.println("the area is  "+tri.area(h,b));
      System.out.println("the perimeter is  "+tri.perimeter(a,b,c));
  

    }
    
}

class circle {
    //first method in circle class returns the area of the circle 
    double area(double r){
     return (Math.PI*r*r);
    }
    //second method in circle class returns the perimeter of the circle 
    double perimeter(double r){
      return (2*Math.PI*r);
    }
    }
class triangle{
    //first method in tri class returns the area of the tri 
    double area(double h,double b){
    return (0.5*h*b);
    }
    //second method in circle class returns the perimeter of the tri 
    double perimeter (double a, double b, double c){
    return (a+b+c);
    }
}  



