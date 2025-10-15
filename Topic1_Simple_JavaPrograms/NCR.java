package Set_of_Qustions;

import java.util.Scanner;

public class NCR {

    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");   // For 5
        int n = sc.nextInt();
        System.out.println("Enter r :");   // For 3
        int r = sc.nextInt();
        int nfact,rfact,nrfact;
        int ncr;
        nfact = fact(n);
        rfact = fact(r);
        nrfact = fact(n-r);
        ncr = nfact/(rfact*nrfact);


        System.out.println(nfact);    // 120
        System.out.println(rfact);    // 6
        System.out.println(nrfact);   // 2
        System.out.println(ncr);      // 10
    }
}
