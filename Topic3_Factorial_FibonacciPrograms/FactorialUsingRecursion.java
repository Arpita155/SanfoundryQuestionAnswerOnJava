package Sanfoundry_for_questions.Topic3_Factorial_FibonacciPrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {
    static int facto(int a){
        if(a>1){
            return a*facto(a-1);
        }
        return 1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();
        int result = facto(x);
        System.out.println("factorial of "+x+" = "+result);
    }
}
