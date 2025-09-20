// Java program to print diagonal star patterns

import java.util.*;
import java.lang.*;

public class GfG{
    public static void pattern(int n)
    {
        // For printing upper portion
        int c1 = (n - 1) / 2;
    
        // For printing lower portion
        int c2 = 3 * n / 2 - 1;
    
        // Loop denoting rows
        for (int i = 0; i < n; i++) {
        
        // Loop denoting columns
        for (int j = 0; j < n; j++) {
            
            // Checking conditions for printing
            // pattern
            if (i + j == c1 || i - j == c1
                || j - i == c1 || i + j == c2 ||
                i == c1 || j == c1)
                    System.out.print("*");
            else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    // Driver function 
    public static void main(String argc[]){

        // n denotes size which should be odd
        int n = 9;

        // Function calling
        pattern(n);
    }
    
}

// This code is contributed by Sagar Shukla
