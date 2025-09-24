// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// PS : The name of the public class has to be Main for the code to work
import java.util.*;
public class Main {
    public static void main(String args[]){
        int n = 15;
        for(int i=0;i<n;i++){
            for(int j=0;j< 2*n ;j++){
                if (i==n-1 && ( i-j ) == 0){
                    System.out.print(" *");
                }
                else if( ( i-j ) == 0 ) {
                    System.out.print("* ");
                }
                else if ( ( i+j ) == (2*n-1) && (i != (j-1))){ 
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
