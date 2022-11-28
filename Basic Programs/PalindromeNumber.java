/*
 Palindrome Number: Number that is same after reversing.
 */
import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args) {
       
        int temp , r ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        temp = number;
        int sum = 0;

        while(number > 0){
            r = number % 10;
            sum = (sum * 10) + r;
            number = number/10;
        }
        if(temp == sum){
        System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
        
    }
}