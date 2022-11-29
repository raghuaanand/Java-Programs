import java.util.*;

// WAP to find the factorial of the given number

class Solution{
    int result = 1;

    void getFactorial(int n){
        for(int i = 1; i <= n; i++){
            result = result * i;
    }
    System.out.println("Factorial of the number " + n + " is " + result);
}
}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Solution s1 = new Solution();
        s1.getFactorial(number);
        
    }
}
