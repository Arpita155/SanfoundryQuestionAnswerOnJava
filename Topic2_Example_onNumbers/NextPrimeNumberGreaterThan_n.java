package Sanfoundry_for_questions.Topic2_Example_onNumbers;

public class NextPrimeNumberGreaterThan_n {

    public static int nextPrime(int n) {
        // return next prime number greater than n
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

    public static void main(String[] args) {
        int result = nextPrime(15);
        System.out.println("The next prime number of n is : "+result);
    }
}
