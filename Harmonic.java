import java.util.*;
public class Harmonic {
    public static void main(String[] args) {
        float harmonic = 1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for print Harmonic series: ");
int a= sc.nextInt();
for(int i=1;i<=a;i++){
    
    System.out.print("1/"+i+" + ");
    harmonic += (float)1 / i;
}
System.out.println();
System.out.println();
System.out.println("Sum of Harmonic series is: "+harmonic);

    }
}
