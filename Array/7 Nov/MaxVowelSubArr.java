
/*
Maximum Number of Vowels in a Substring of Given Length
Find the maximum number of vowels in any substring of length k.
*/

import java.util.*;

class MaxVowelSubArr {
    
    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
		
        return "aeiouAEIOU".indexOf(c) != -1;
		
    }

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = xyz.nextLine();

        System.out.println("Enter window size k: ");
        int k = xyz.nextInt();

        int n = str.length();
        if (k > n) {
            System.out.println("Window size cannot be larger than string length.");
			
            return;
        }

        char[] strArr = str.toCharArray();

         int count = 0;
        for (int i = 0; i < k; i++) {
			
            if (isVowel(strArr[i]))
				count++;
			
        }

        int maxCount = count;

       
        for (int i = k; i < n; i++) {
            // Remove the left-most char from count
            if (isVowel(strArr[i - k]))
				count--;

            // Add the new char into count
            if (isVowel(strArr[i])) 
				count++;

            // Update maxCount
            maxCount = Math.max(maxCount, count);
        }

        System.out.println("Maximum number of vowels in any substring of length " + k + " = " + maxCount);
    }
}
