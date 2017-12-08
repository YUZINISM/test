package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {

	int a, b, result;
	String op;
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();

	Cal() {

		System.out.println("First number :");
		a = s.nextInt();
		System.out.println("Second number :");
		b = s.nextInt();
		System.out.println("Operator:");
		op = s.next();
	}

	int add() {
		return a + b;

	}

	int minus() {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;

		}
		return a - b;

	}

	int times() {
		return a * b;

	}

	int divide() {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;

		}
		return a / b;

	}

	void compute() {

		if (op.equals("+")) {
			result = add();
		} else if (op.equals("-")) {
			result = minus();
		} else if (op.equals("*")) {
			result = times();
		} else {
			result = divide();
		}
		al.add(result);

	}

	public static void main(String args[]) {

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		Cal calculator = new Cal();

		Scanner s = new Scanner(System.in);
		System.out.println("Go or Stop?");
		String again = s.next();
		while (again.equals("Go")) {
			calculator.Cal();

			System.out.println("Go or Stop?");
			again = s.next();
		}
		System.out.println(al1);
	}

}
