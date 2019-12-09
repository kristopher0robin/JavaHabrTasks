package Task03_PrimeNumbers;

/**
 * Created by juta on 12/5/2019.
 */

public class Task03 {

    public static void main(String[] args) {

        for(int i=2; i<=100; i++) {
            boolean isPrime = true;

            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(i);
            }
        }

    }
}
