import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String args[]) {
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " character is an vowel");
        } else {
            System.out.println(ch + " character is a consonant");
        }
    }
}