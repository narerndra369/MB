import java.util.*;
public class Main {
    public static void main(String args[]){
        int n=15;
       for(int i=0;i<n;i++){
           for(int k=0;k<n-i-1;k++){
               System.out.print(" ");
           }
           for(int k=0;k<(2*i)+1;k++){
               System.out.print("*");
           }
           System.out.println();
       }
        for(int i=n-1;i>=0;i--){
            for(int k=0;k<n-i-1;k++){
               System.out.print(" ");
           }
           for(int k=0;k<(2*i)+1;k++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
