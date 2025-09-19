import java.util.Random;
import java.util.Scanner;
public class Grading {
 public static void main(String[] args) {
     Random rand = new Random();
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter your grade ");
     int grade = input.nextInt();

     int passing = rand.nextInt(60,70);
     if (grade >= passing ) {
         System.out.println("Passed! " + "your grade is " + grade + " The passing grade is " + passing);
     }
     else {
         System.out.println("Failed! " + "your grade is " + grade + " The passing grade was " + passing);
     }
 }

}