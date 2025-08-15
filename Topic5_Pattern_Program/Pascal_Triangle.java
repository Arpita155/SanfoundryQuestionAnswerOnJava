package Sanfoundry_for_questions.Topic5_Pattern_program;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int number=1;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
