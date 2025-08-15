package Sanfoundry_for_questions.Topic5_Pattern_program;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String []args){

        //  1
        //  2 3
        //  4 5 6
        //  7 8 9 10
        //  11 12 13 14 15

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length:");
        int n= sc.nextInt();
        int m=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
