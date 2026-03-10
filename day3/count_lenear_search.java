package day3;

public class count_lenear_search {
    public static void main(String[] args) {
        int arr[]={3,8,6,8,10};
    int target=8;
    int a=arr.length;
    int c=0;
    for(int i=0;i<a;i++){
        if(target==arr[i]){
            c=c+1;
        }
    }
    System.out.println(c);
    }
    
}
