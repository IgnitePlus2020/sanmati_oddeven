package oddeven;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number to check if it is odd or even");
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        if(n%2==0)
            System.out.println("Given number is even");
        else
            System.out.println("Given number is odd");
    }
}
