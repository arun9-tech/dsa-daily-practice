package day2;

public class largest_element_array {
    public static void main(String args[]){
        int arr[]={4,15,8,21,16,3,18};
        int a=arr[0];
        int b=arr.length;
        for(int i=0;i<b;i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
         System.out.println(a);
        
    }
}
