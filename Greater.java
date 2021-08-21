import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Find the Largest Number among Three number");
        System.out.print("Enter 1st num: ");
        int a = s.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = s.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = s.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is Largest");
        }else if(b>a && b>c)
        {
            System.out.println(b+" is Largest");
        }else {
            System.out.println(c+" is Largest");
        }
    }
}
