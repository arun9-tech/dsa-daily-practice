package day2;

public class greterthan_ten_array {
    public static void main(String args[]){
        int arr[]={4,15,8,21,16,3,18};
        int b=arr.length;
        int c=0;
        for(int i=0;i<b;i++){
            if(arr[i]>10){
                c++;
            }
        }
        System.out.print(c);
    }
}
