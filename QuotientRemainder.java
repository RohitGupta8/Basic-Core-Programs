import java.util.*;
public class QuotientRemainder {

    public static void main(String[] args) {
  Scanner s =new Scanner(System.in);

      float dividend, divisor;
      System.out.print("Enter Dividend: ");
       dividend =s.nextFloat();
      System.out.print("Enter divisor: ");
  divisor=s.nextFloat();
      float quotient = dividend / divisor;
      float remainder = dividend % divisor;
  
      System.out.println("Quotient = " + quotient);
      System.out.println("Remainder = " + remainder);
    }
  }