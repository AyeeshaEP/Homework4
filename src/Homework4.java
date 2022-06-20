import java.util.Scanner;
public class Homework4 {
 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.print("Please enter an integer for x: ");

  int counter = scan.nextInt();

  for (int i = 1; i <= counter; i++) {
   if (i % 3 == 0 && i % 2 == 1) {
    System.out.println(i);

//   System.out.print("Please enter a positive integer for n: ");
//
//   int n = scan.nextInt();
//   int sum = 0;
//
//   for(int i = 1; i <= n; i++ ) {
//    if(i % 2 == 0) {
//     sum += i;
//    }
//
//  }
//   System.out.println("The sum of all even numbers between 1 and " + n + "is: " + sum);
   }
  }
 
