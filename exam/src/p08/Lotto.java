package p08;


	import java.util.Arrays;
	import java.util.Random;

	public class Lotto {


	   public static void main(String args[]) {
	      Random any = new Random();
	      
	      int randArr[] = new int[6];
	      
	      for(int i = 0; i < 6; i++) {
	         int a = any.nextInt(46) + 1;
	         randArr[i] = a;
	      }
	      
	      for(int i = 5; i > 0; i--) {//reference pointer  **ascending
	         for(int j = i-1; j >= 0; j--) {//no. of comparable 
	            if(randArr[i] < randArr[j]) {
	               int tmp = randArr[i];
	               randArr[i] = randArr[j];
	               randArr[j] = tmp;
	            }
	            else if(randArr[i] == randArr[j]) {
	               randArr[j] = 0;
	            }
	            
	         }
	      }   
	      if(randArr[0] == 0) {
	         randArr[0] = any.nextInt(46) + 1;
	         //ascend function
	         //redo check
	         }//function 화
	      
	      
	      System.out.print(Arrays.toString(randArr));
	      
	   }
	}

