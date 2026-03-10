package day3;

public class linear_search {
    public static void main(String args[]){
        int arr[]={5,12,9,20,7};
        int target=20;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(target==arr[i]){
                System.out.println("element found at index"+i);
                 return;
            }     
        }
        System.out.println("element not found");
    }
}
