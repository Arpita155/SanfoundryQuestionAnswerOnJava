package Set_of_Qustions;

import java.util.Scanner;

public class LCM {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // take input and print their LCM
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=(a*b)/gcd(a,b);
        System.out.println(lcm);

    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input and print their LCM
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("enter the second number: ");
        int b=sc.nextInt();
        int lcm=(a*b)/gcd(a,b);
        System.out.println("LCM of two number: "+lcm);
    }
}
