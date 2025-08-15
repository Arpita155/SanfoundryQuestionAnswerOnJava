package Sanfoundry_for_questions.Topic3_Factorial_FibonacciPrograms;

import java.util.Scanner;

public class FactorialWithoutRecursion {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        System.out.println("factorial of "+x+" is "+fact);
    }
}
