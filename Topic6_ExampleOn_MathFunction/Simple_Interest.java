package Sanfoundry_for_questions.Topic6_ExampleOn_MathFunction;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principal:");
        int p=sc.nextInt();
        System.out.println("enter the rate/interest:");
        int r=sc.nextInt();
        System.out.println("enter the time/period:");
        int t=sc.nextInt();
        float si;
        si = (p*r*t) / 100;
        System.out.println("the simple interest is: "+si);
    }
}
