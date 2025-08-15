package Sanfoundry_for_questions.Topic4_Conversion_Programs;

import java.util.Scanner;

public class BinaryToHexadecimal {
    static void convert(int a){
        String str = Integer.toString(a);
        System.out.println("Hexadecimal value is: "+str);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int n = Integer.parseInt(sc.nextLine(),6);
        convert(n);
    }
}
