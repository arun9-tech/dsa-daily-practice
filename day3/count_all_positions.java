package day3;

public class count_all_positions {
    public static void main(String[] args) {
        int arr[] = {5, 8, 5, 10, 5};
        int target = 5;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(arr[i]==target){
                System.out.println("index is " +i);
            }
        }
    }
}
