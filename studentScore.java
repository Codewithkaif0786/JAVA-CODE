import java.util.Scanner;

public class Student {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Student score : ");
      double score = sc .nextDouble();
      if(score > 100){
         System.out.println("Invalid");
      }
      else if(score >= 91){
         System.out.println("Grade O");
      }
      else if(score >= 81){
         System.out.println("Grade A+");
      }
      else if(score >= 71){
         System.out.println("Grade A");
      }
      else if(score >= 61){
         System.out.println("Grade B+");
      }
      else if(score >=51){
         System.out.println("Grade B");
      }
      else if(score >=45){
         System.out.println("Grade C");
      }
      else{
         System.out.println("Fail");
      }
   }

}
