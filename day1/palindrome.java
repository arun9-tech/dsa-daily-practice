package day1;

public class palindrome {
     public static void main(String args[]){
        int a=12345;
        int original=a;
        int b=0;
        while(a>0){
            int c=a%10;
            b=b*10+c;
             a=a/10;
        }
        if(original==b){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
