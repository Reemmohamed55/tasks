//quick sort function of array elements 
package task7;

public class Task7 {
 public static void main(String [] args) {
 System.out.println("Hello! World!!");
 int [] array= {3, 1, 5, 4, 2};
 //calling quick and pass values of parameters to it 
 quick_sort(array, 0, array.length - 1);
 //print the array after sorting it 
 for (int i = 0 ; i < array.length ; i++) {
 System.out.println(array[i]);
 }
 }

 public static void quick_sort(int [] array, int left, int right) {
 if (left < right) {
 int q = position(array, left, right); // calling position method 
 quick_sort(array, left, q-1);
 quick_sort(array, q+1, right);
 }
 }
 private static int position(int array [], int left, int right) {
 int i = left - 1;
 for (int j = left ; j < right ; j++) {
 if (array[j] < array[right]) {
 i++;
 swap(array, i, j);
 }
 }


 swap(array, i+1, right);//calling swap method 
 return i+1;
 }
  //swap function to swap  between elements 
 private static void swap(int [] array, int i, int j) {
 int temp = array[i];
 array[i] = array[j];
 array[j] = temp;
 }
 
}


