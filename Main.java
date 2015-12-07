package BasicCalculator;
import java.util.Scanner;
/**
 * Created by Kalkidan on 12/7/2015.
 */
public class Main {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      //Class Objects
      Add objAdd=new Add();
      Subtract objSub=new Subtract();
      //which operations to perform
      System.out.println("Select an operator add or subtract [1/2]");
      int reply=sc.nextInt();

      sc.nextLine();
      //conditional loop to perform
      if(reply==1){
         System.out.println("Would you like to add int or double [int/double]?");
         String reply2=sc.nextLine();
         if(reply2.equalsIgnoreCase("int")){
            System.out.println("Please enter the first number");
            int first=sc.nextInt();
            System.out.println("Please enter the second number");
            int second=sc.nextInt();
            System.out.println("Result = "+ objAdd.addInt(first,second));
         }
         else if(reply2.equalsIgnoreCase("double")){
            System.out.println("Please enter the first number");
            double f=sc.nextInt();
            System.out.println("Please enter the second number");
            double s=sc.nextInt();
            System.out.println("Result = "+ objAdd.addDouble(f, s));
         }
      }
      else if(reply==2){
         System.out.println("Would you like to subtract int or double [int/double]?");
         String reply3=sc.nextLine();
         if(reply3.equalsIgnoreCase("int")){
            System.out.println("Please enter the first number");
            int first2=sc.nextInt();
            System.out.println("Please enter the second number");
            int second2=sc.nextInt();
            System.out.println("Result = "+ objSub.subtractInt(first2, second2));
         }
         else if(reply3.equalsIgnoreCase("double")){
            System.out.println("Please enter the first number");
            double f2=sc.nextDouble();
            System.out.println("Please enter the second number");
            double s2=sc.nextDouble();
            System.out.println("Result = "+ objSub.subtractDouble(f2,s2));
         }
      }
   }
}
