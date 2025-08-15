package Sanfoundry_for_questions.Topic1_Simple_JavaPrograms;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1. Sum of even and odd numbers
        /*System.out.println("enter first range:");
        int a=sc.nextInt();
        System.out.println("enter second range:");
        int b=sc.nextInt();
        int sumE=0,sumO=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                sumE+=i;
            }else{
                sumO+=i;
            }
        }
        System.out.println("sum of even numbers= "+sumE);
        System.out.println("sum of odd numbers= "+sumO);
         */

        //Q2. Swap two numbers
        // without third variable
        /*System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("before swap a= "+a+" and b= "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap a= "+a+" and b= "+ b);
        */

        // using third variable
        /*System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("before swap a= "+a+" and b= "+ b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swap a= "+a+" and b= "+ b);
         */


        //Q3. WAP to check if a number is divisable by 5 or not.
        /*System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println(a+ " is divisable by 5");
        }else{
            System.out.println(a+ " is not divisable by 5");
        }
        */

        //Q4. Sum of digits of a number.
        /*System.out.println("enter the number:");
        int a=sc.nextInt();
        int rem,sum=0;
        while (a!=0){
            rem=a%10;
            sum=sum+rem;
            a/=10;
        }
        System.out.println("sum of digits of the number= "+sum);
        */

        //Q5. WAP to extract digits from a given number.
        /*System.out.println("enter the number:");
        int a=sc.nextInt();
        int rem,sum=0;
        int counter=0;
        int b=a;
        while (a!=0){
            a/=10;
            counter++;
        }
        while (b!=0){
            rem=b%10;
            System.out.println("digit at position"+counter+":"+rem);
            b/=10;
            counter--;
        }
        */

        //Q6. WAP to increment by 1 to all the digits of a given number.
        /*System.out.println("enter the number:");
        int a=sc.nextInt();
        int rem,rev=0,m;
        while(a>0){
            rem=a%10;
            rem++;
            rev=rev*10+rem;
            a/=10;
        }
        a=rev;
        rev=0;
        while (a> 0) {
            rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        System.out.println("result= "+rev);
        */

        //Q7. WAP to print multiplication table.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
         */

        //Q8. check a character is a vowel, constant or digits.
        /*System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u') {
            System.out.println(ch + " is vowel");
        }else{
            System.out.println(ch +" is consonant");
        }
         */

        //Q9. WAP to check whether a given alphabet are uppercase or lowercase or digits
        /*System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch>=97 && ch<=122){
            System.out.println(ch +"is in lowercase");
        }else if(ch>=65 && ch<=90){
            System.out.println(ch+" is in uppercase");
        }else{
            System.out.println(ch +" is digit");
        }
         */
    }
}
