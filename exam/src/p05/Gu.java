package p05;

import java.util.Scanner;

public class Gu {
	   
	   int first;
	   int last;
	   int multi1;
	   int multi2;
	   int except;
	   String ans;
	   
	   void getNum() {
	      Scanner s = new Scanner(System.in);
	      System.out.println("몇단부터 시작할가요?");
	      first = s.nextInt();
	      System.out.println("몇단까지 할가요?");
	      last = s.nextInt();
	      System.out.println("몇배수 부터 시작할가요?");
	      multi1 = s.nextInt();
	      System.out.println("몇배수 까지 할가요?");
	      multi2 = s.nextInt();
	      System.out.println("어떤 배수를 제외하고 싶으세요?");
	      except = s.nextInt();
	      System.out.println(except + "의 배수의 갯수를 세어드릴가요? (yes 혹은 no) ");
	      ans = s.next();
	   }
	   
	   void makeTable() {
	      
	      int count = 0;
	      
	      for(int i = first; i <= last  ; i++) {
	         String str = "";
	         for(int j = multi1; j <= multi2 ; j++) {
	            if((i*j%except) !=0) {
	            str = str + i + "x" + j + "=" + (i*j) + ",";
	            }else{
	            str += + except +"의 배수입니다!,";
	            count += 1;
	            }
	         }
	         
	         System.out.println(str.substring(0, str.length()-1));
	         }
	      
	      if(ans.equals("yes")) {   
	         System.out.println(except + "의 배수는 총 " + count + "개 입니다.");
	      }
	   }
	   
	   
	   public static void main(String args[]) {
		   Gu g = new Gu();
		   g.getNum();
		   g.makeTable();
	      
	   }
	}