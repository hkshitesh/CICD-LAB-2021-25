package com.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);   
        int a,b,c`;
        a = 0;
        b = 0;
        c = 0;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        c = a+b; 
        System.out.println("Sum is:");
        System.out.println(c);


    }
}
