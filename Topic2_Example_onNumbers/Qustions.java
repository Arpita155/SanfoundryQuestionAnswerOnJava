package Sanfoundry_for_questions.Topic2_Example_onNumbers;

import java.util.Scanner;

public class Qustions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1. Prime numbers within a given range.
        /*System.out.println("enter the lower range:");
        int a=sc.nextInt();
        System.out.println("enter the upper range:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int j;
            int count=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    count=1;
                }
            }
            if(count==0){
                System.out.println(j);
            }
        }
         */

        //Q Given an integer n. Write a program to find the first prime number greater than n.
        /*
        public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int prime = 2;
        if(n < 2) return prime;
        boolean isPrime = true;
        int ans = 0;


        while(isPrime){
            n = n+1;
            int count = 0;
            for(int i=2; i<n; i++){
                if(n % i == 0) count++;
            }
            if(count == 0){
                ans = n;
                isPrime = false;
            }

        }
        return ans;
        }
         */


        // Q2. WAP to check prime numbers.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==0){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+ " is not prime number");
        }
        */

        //Q3. WAP to check a number is perfect or not.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+" is perfect number");
        }else{
            System.out.println(n+" is not perfect number");
        }
        */

        //Q4. WAP to check armstrong number
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int d=0;
        int arm=0;
        int temp=n;
        int temp1=n;
        while (n!=0){
            d+=1;
            n/=10;
        }
        while (temp!=0){
            int rem=temp%10;
            arm=arm+(int) Math.pow(rem,d);
            temp/=10;
        }
        if(temp1==arm){
            System.out.println(temp1+" is armstrong number");
        }else{
            System.out.println(temp1+" is not armstrong number");
        }
         */

        //Q5. WAP to print Armstrong number between 1 to 1000.
        /*for(int i=1;i<=1000;i++){
            int arm=0;
            int d=0;
            int temp=i;
            int temp1=i;
            while(temp!=0){
                d+=1;
                temp/=10;
            }
            while (temp1!=0){
                int rem=temp1%10;
                arm=arm+(int) Math.pow(rem,d);
                temp1/=10;
            }
            if(i==arm){
                System.out.println(i);
            }
        }
        */

        //Q6. Reverse a number and find its sum using do while loop.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        do{
            int rem=n%10;
            rev=rev*10+rem;
            sum+=rem;
            n/=10;
        }while (n!=0);
        System.out.println(rev);
        System.out.println("sum= "+sum);
         */

        //Q7. Sum of natural numbers using while loop.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum of n natural numbers= "+sum);
        */

        //Q8. Print first n square numbers.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
        */

        //Q9. Sum of n square number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(i*i);
        }
        System.out.println("sum of n square number= "+sum);
         */

        //Q10. Check a given year is leap year or not.
        /*System.out.println("enter the year:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not leap year");
        }
        */

        //Q11. Java program to extract last two digits of a given year.
        /*System.out.println("enter the year:");
        int year=sc.nextInt();
        int d=0;
        int i=0;
        int rev=0;
        while(i<2){
            int rem=year%10;
            rev=rev*10+rem;
            year/=10;
            i++;
        }
        int rev1=0;
        while(rev!=0){
            int rem1=rev%10;
            rev1=rev1*10+rem1;
            rev/=10;
        }
        System.out.println(rev1);
        */

        //Q12. convert days into year,months,and days
        /*System.out.println("enter the days:");
        int days=sc.nextInt();
        int remaining_days;
        int year=days/365;
        remaining_days=days%365;
        int month=remaining_days/30;
        remaining_days=remaining_days%30;

        System.out.println(year+" year");
        System.out.println(month+" month");
        System.out.println(remaining_days+" days");
        */
    }
}
