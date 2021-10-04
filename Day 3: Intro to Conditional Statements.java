import java.text.*;
import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
     if (n % 2 == 0) {
            if (n >= 2 && n < 6)
                System.out.println("Not Weird");
            else if (n >= 6 && n < 21)
                System.out.println("Weird");
            else if (n > 20)
                System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
}
}
