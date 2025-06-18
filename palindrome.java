import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine() ;
        boolean isPalindrome=true;
        int start=0;
        int end =str.length() -1;
        while (start < end){
            if (str.charAt(start) !=str.charAt(end)){
                isPalindrome=false;
                break;
            }
            start ++;
            end --;
        }
        if (isPalindrome){
            System.out.println("the string is a palindrome.");
        }else{
            System.out.println("the string is not a palindrome.");
        }
    }
}
