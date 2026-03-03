package day1;

public class sum_of_digits {
     public static void main(String args[]){
        int a=12345;
        int b=0;
        while(a>0){
            int c=a%10;
            b=b+c;
             a=a/10;
        }
        System.out.println(b);
    }
}
