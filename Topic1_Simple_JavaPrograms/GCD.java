package Set_of_Qustions;

import java.util.Scanner;

public class GCD {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q1. GCD or HCF .

        // Approach-1
        /*System.out.println("enter the first number");
        int m=sc.nextInt();
        System.out.println("enter the second number");
        int n=sc.nextInt();
        int hcf=0;
        System.out.println("Highest common factors are");
        for(int i=1;i<=m || i<=n;i++){
            if(m%i==0 & n%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF: "+hcf);
         */

        //Approach-2
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);


    }
}
