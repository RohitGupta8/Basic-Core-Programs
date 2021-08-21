import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int a = 1,i;
        System.out.print("Enter value for print table of power of 2: ");
        Scanner sc = new Scanner(System.in);
        Long b=sc.nextLong();

        for ( i = 1;i<=b; i++) {
            a = a * 2;
            System.out.println("2 ^ " + i + " = " + a);
        }
    }
}
