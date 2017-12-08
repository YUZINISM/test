package p14;

import java.util.ArrayList;

public class Hcf {

	ArrayList<Integer> primeList = new ArrayList<Integer>();
	ArrayList<Integer> factorList = new ArrayList<Integer>();
	int num = 20;
	int maxPrime = 20;
	
	void getPrime(){
		
		for(int i =2; i <= num; i++) {
			if(num%i == 0) {
				factorList.add(i);
			}
		}
		if(factorList.size() == 1) {
			primeList.add(factorList.get(0));
		}
		System.out.println(factorList);
		System.out.println(primeList);
		
		
		
	}
	
	public static void main(String args[]) {
		Hcf hcf = new Hcf();
		hcf.getPrime();
		
		
	}
}
