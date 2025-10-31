package Set_of_Qustions;

import java.util.Scanner;

public class Working_With_Numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Q1. positive or negative number.
        /*System.out.println("enter the number you want to check:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n +" is positive number");
        }else {
            System.out.println(n +" is negative number");
        }
         */

        //Q2. Check even or odd .
        /*System.out.println("enter the number you want to check:");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n + " is even number");
        }
        else {
            System.out.println(n + " is odd number");
        }*/

        //Q3. Sum of natural numbers.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of n natural number= "+ sum);
         */

        //Q4.Greatest of three numbers .
        /*System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third number:");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greater");
        } else if(b>=a && b>=c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
        */

        //Q5.Leap year
        /*System.out.println("enter the year:");
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0) || (a%400==0)){
            System.out.println( a +" is leap year");
        }else{
            System.out.println(a + " is not leap year");
        }
        */

        //Q6. Prime number
        System.out.println("enter the number you want to check:");
        int a=sc.nextInt();
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0){
                count+=1;
            }
        }
        if(count==0){
            System.out.println(a + " is prime number");
        }else{
            System.out.println(a + " is not prime number");
        }
//        System.out.println("count= "+count);


        //Q7.prime number within a given range.
        /*System.out.println("enter the lower range:");
        int lower=sc.nextInt();
        System.out.println("enter the upper range:");
        int upper=sc.nextInt();
        for(int i=lower;i<=upper;i++)
        {
            int j,count=0;
            for(j=2;j<i;j++){
                if(i%j==0) {
                    count += 1;
                }
            }
            if(count==0){
                System.out.println(j + " is prime number");
            }else{
                System.out.println(j + "is not prime number");
            }
        }
         */


        //Q***. Given an integer n. Write a program to find the first prime number greater than n.---->(GeeksForGeeks)
        /*System.out.println("Enter the number:");
        int n = sc.nextInt();
        int prime = 2;
        if(n < 2)
            System.out.println(prime);
        else {
            boolean isPrime = true;
            int ans = 0;

            while (isPrime) {
                n = n + 1;
                int count = 0;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) count++;
                }
                if (count == 0) {
                    ans = n;
                    isPrime = false;
                }

            }
            System.out.println(ans);
        }
         */

        //Q8.sum of digits of a number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int digit=0;
        int sum=0;
        while (n>0){
            digit=digit+1;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(digit);
        System.out.println("sum of digits of a number= "+sum);
         */

        //Q9.Reverse of a number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=(rev*10)+(rem);
            n=n/10;
        }
        System.out.println("reverse of the number is " +rev);
         */

        //Q9.1. Reverse number within a range.
        /*System.out.println("enter the lower range:");
        int low=sc.nextInt();
        System.out.println("enter the upper range:");
        int high=sc.nextInt();
        for(int i=low;i<high;i++){
            int temp=i,rem,rev=0;
            while(temp!=0){
                rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }
            System.out.println("reverse of the number" +i+" is "+ rev);
        }*/

        //Q10.Palindrome number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("it is palindrome number");
        }else{
            System.out.println("it is not palindrome number");
        }
         */

        //Q10.1. Palindrome number within range.
        /*System.out.println("enter lower range:");
        int low =sc.nextInt();
        System.out.println("enter lower range:");
        int high =sc.nextInt();
        for(int i=low;i<=high;i++){
            int rem,temp=i,rev=0;
            while (temp!=0){
                rem=temp%10;
                rev=(rev*10)+rem;
                temp/=10;
            }
            if(rev==i){
                System.out.println(i +" is palindrome number");
            }
        }
         */

        //Q11.Armstrong number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int digit=0,temp=n,temp1=n,arm=0;
        while(n!=0){
            digit+=1;
            n=n/10;
        }
        while (temp!=0){
            int rem=temp%10;
            arm=arm+(int) Math.pow(rem,digit);
            temp=temp/10;
        }
        if(arm==temp1){
            System.out.println("it is armstong number");
        }else{
            System.out.println("it is not armstrong number");
        }
        */

        //Q11. Armstrong number within a given range
        /*System.out.println("enter the number:");
        int low=sc.nextInt();
        System.out.println("enter the number:");
        int high =sc.nextInt();
        for(int i=low;i<=high;i++){
            int digit=0,temp=i,temp1=i,rem,arm=0;
            while (temp!=0){
                digit+=1;
                temp=temp/10;
            }
            while(temp1!=0){
                rem=temp1%10;
                arm=arm+(int) Math.pow(rem,digit);
                temp1/=10;
            }
            if(arm==i){
                System.out.println("Armstrong number= "+i);
            }
        }
         */

        //Q12. Factorial of a number.
        /*System.out.println("enter the nth term:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of the number is "+fact);
        */

        //Q13. Find Nth term of fibonaci series.
//        System.out.println("enter the nth term:");
//        int n=sc.nextInt();


        //Q14. power of a number.
        /*System.out.println("enter the nth term:");
        int a=sc.nextInt();
        System.out.println("enter the nth term:");
        int b=sc.nextInt();
        double result;
        result = Math.pow(a,b);
        System.out.println("power of the number is "+result);
        */

        //Q15. Factor of a number.
        /*System.out.println("enter the nth term:");
        int n=sc.nextInt();
        System.out.println("factors of the number are ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
         */

        //Q16. Finding prime factor of a number.
        /*System.out.println("enter the nth term:");
        int n=sc.nextInt();
        int i,j;
        for(i=2;i<=n;i++) {
            if (n % i == 0) {
                int sum=0;
                for(j=2;j<i;j++){
                    if(i%j==0){
                       sum=1;
                       break;
                    }
                }
                if(sum==0){
                    System.out.println(j);
                }
            }
        }*/



        //Q16. Strong number

        //Q17. Perfect number.
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println(n + " is perfect number");
        }else{
            System.out.println(n + " is not perfect number");
        }
        */

        //Q18. perfect number within range.
        /*System.out.println("enter the lower range:");
        int low=sc.nextInt();
        System.out.println("enter the high range:");
        int high=sc.nextInt();
        int sum;
        for(int i=low;i<=high;i++){
            sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==sum){
                System.out.println("perfect numbers are "+sum);
            }
        }
         */

        //Q19. perfect square
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n>=0){
            int sr=(int)Math.sqrt(n);
            if(sr*sr==n){
                System.out.println("perfect square");
            }else{
                System.out.println(" not perfect square");
            }
        }
         */

        //Q20. Neon number--(sum of digits of its square is equal to the number itself)
        /*System.out.println("enter the number");
        int n=sc.nextInt();
        int n1=n*n;
        int rem,sum=0;
        while(n1!=0){
            rem=n1%10;
            sum+=rem;
            n1/=10;
        }
        if(n==sum){
            System.out.println(n +" is neon number");
        }else{
            System.out.println(n +" is not neon number");
        }
         */

        //Q21. Spy number.---(sum of all digits of the number == multiple of all digits of the number)
        /*System.out.println("enter the number");
        int n=sc.nextInt();
        int rem,temp=n,sum=0,mult=1;
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            mult=mult*rem;
            n/=10;
        }
        if(sum==mult){
            System.out.println(temp + " is spy number");
        }else{
            System.out.println(temp + " is not spy number");
        }
         */

        //Q22. Automorphic number----> Definition -(the square of the number ends with the same number. Ex-5 square=25, 6 square=36)
        /*System.out.println("enter the number");
        int n=sc.nextInt();
        int sq=n*n;
        System.out.println(sq);
        if(n%10==sq%10){
            System.out.println("automorphic number");
        }else{
            System.out.println("not automorphic number");
        }
         */

        //Q23. Harshad number--( Harshad number is a number that is divisable by sum of its digits.  Ex-27/(2+1)=7 )
        /*System.out.println("enter the number");
        int n=sc.nextInt();
        int rem,sum=0,temp=n;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
        if(temp%sum==0){
            System.out.println("Harshad number");
        }else{
            System.out.println(" not Harshad number");
        }
         */

        //Q24. Abundant number--(sum of all the factors of a number except that number itself is greater than the number.  Ex-18 sum of digits =21)
        /*System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        if(sum>n){
            System.out.println("abundant number");
        }else{
            System.out.println("not abundant number");
        }
         */


    }
}
