/* task 1  by using of for loop to print 1 to 10 numbers
public class day5 {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
    */
   // by using of while loop
   /*public class day5{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
   }*/

    // task 2
    // by using of for loop to print even numbers first 20
    // public class day5{
    //     public static void main(String args[]){
    //         for(int i=0;i<=20;i++){
    //             if(i%2==0){
    //                 System.out.println(i);
    //             }
    //         }
    //     }
    // }
// 
// by using of while loop
// public class day5{
//     public static void main(String args[]){
//         int i=1;
//         while(i<=20){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//             i++;
//         }
//     }
// }
// task 3
// print a star
public class day5{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}