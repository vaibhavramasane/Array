// Q19. Write a java program to find prime number of an array
import java.util.*;

class PrimeArr {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter values in array:");

        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < a.length; i++) {
            int count = 0;  // reset for each number
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // prime numbers have exactly 2 factors
                System.out.print(a[i] + " ");
            }
        }
    }
}
