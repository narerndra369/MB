import java.util.*;
public class Main {
    public static void main(String args[]){
        int n = 4-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<= 2*n ;j++){
                if( ( i-j ) == 0 || (i+j) == 2*n) { // logiv changed
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
