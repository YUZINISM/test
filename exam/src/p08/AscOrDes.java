package p08;

import java.util.Arrays;
import java.util.Scanner;

public class AscOrDes {

   void getNum() {
      Scanner s = new Scanner(System.in);
   }
   
   public static void main(String args[]) {
      
      int arr[] = new int[5];
      arr[0] = 3;
      arr[1] = 3;
      arr[2] = 3;
      arr[3] = 3;
      arr[4] = 3;
      
      for(int i = 4; i > 0; i--) {//reference pointer  **ascending
         for(int j = i-1; j >= 0; j--) {//no. of comparable 
            if(arr[i] < arr[j]) {
               int tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
            }
            else if(arr[i] == arr[j]) {
               arr[j] = 0;
            }
            
         }
      }
      System.out.print(Arrays.toString(arr));
//      for(int i = 0; i < 5; i++) { //reference pointer **descending
//         for(int j = i+1; j < 5; j++) {//no. of comparable 
//            if(arr[i] < arr[j]) {
//               int tmp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = tmp;
//            }
//            else if(arr[i] == arr[j]) {
//               arr[j]=0;
//            }
//            
//         }
//      }
//      System.out.print(Arrays.toString(arr));
         
            
   }
}