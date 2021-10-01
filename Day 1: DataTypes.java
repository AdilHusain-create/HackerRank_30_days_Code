import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
            int numInt = scan.nextInt();
            double numDouble = scan.nextDouble();
            String printString =scan.next() + scan.nextLine();
            System.out.println(i + numInt);
            System.out.println(d + numDouble);
            System.out.println(s + printString);
    }
    
}
