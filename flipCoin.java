import java.util.Random;
import java.util.Scanner;
public class flipCoin {
    public static void main(String[] args) {
        int headc = 0, tailc = 0;
        double pera = 0, perb = 0;
        Scanner s = new Scanner(System.in);
        Random a = new Random();
        System.out.print("Enter number of times for flip coin: ");
        int inp = s.nextInt();
        for (int i = 1; i <= inp; i++) {
            int ran = a.nextInt(2);
            if (ran == 0) {
                System.out.println(i + ": Head");
                headc += 1;

            } else {
                System.out.println(i + ": Tail");
                tailc += 1;

            }

        }
        pera = (float) headc / inp * 100;
        perb = (float) tailc / inp * 100;
        System.out.println("Total head: " + headc);
        System.out.println("Total Tail: " + tailc);
        System.out.println("Percentage of head: " + pera + " %");
        System.out.println("Percentage of tail: " + perb + " %");
    }

}

