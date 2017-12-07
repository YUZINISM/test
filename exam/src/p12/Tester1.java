package p12;

import java.util.ArrayList;

public class Tester1 {

	  public static void main(String args[]) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
		  
		  System.out.println(obj);
		  /* Displaying array list elements */
		  

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");
		  System.out.println(obj);
		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");
		  System.out.println(obj);
		  
//		  /*Remove element from the given index*/
		  obj.remove(1);
		  System.out.println(obj);
//
//		  System.out.println("Current array list is:"+obj);
	   }
	}
		
		
		
		
	

