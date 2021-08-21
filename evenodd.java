package com.first;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        System.out.print("enter the number = ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if ( a % 2 == 0 )        {
            System.out.println(a+" = number is even");
        }
        else{
            System.out.println(a+" = number is Odd");
        }
    }
}
