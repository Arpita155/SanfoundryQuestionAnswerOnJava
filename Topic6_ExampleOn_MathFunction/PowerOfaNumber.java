package Sanfoundry_for_questions.Topic6_ExampleOn_MathFunction;

import java.util.Scanner;

public class PowerOfaNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        // pow() :  Using pow() function we take power of a number
        System.out.println("enter the number:");
        int n = sc.nextInt();
        double y,z;
        y=Math.pow(n,2);
        z=Math.pow(n,y);
        System.out.println(y);
        System.out.println(z);
    }
}
