package day1;

public class count_digit {
    public static void main(String args[]){
        int a=12345;
        int b=0;
        while(a>0){
            b=b+1;
             a=a/10;
        }
        System.out.println(b);
    }
}
