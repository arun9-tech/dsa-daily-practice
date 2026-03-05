package day2;

public class count_even_array {
    public static void main(String[] args) {
        int arr[]={4,15,8,21,16,3,18};
        int a=arr.length;
        int c=0;
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                 c=c+1; 
            }  
        }
        System.out.println(c);
        
    }
}
