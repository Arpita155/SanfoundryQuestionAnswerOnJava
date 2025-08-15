package Sanfoundry_for_questions.Topic3_Factorial_FibonacciPrograms;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term:");
        int n = sc.nextInt();
        int a=0,b=0,c=1;
        System.out.println(n+" th term of fibonacci series :");
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+" ");
        }
    }
}
