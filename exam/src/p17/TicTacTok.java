package p17;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacTok {

	int[] arr1 = { 0, 0, 0 };// [1,2,3]
	int[] arr2 = { 0, 0, 0 };// [4,5,6]
	int[] arr3 = { 0, 0, 0 };// [7,8,9]

	
	int canNum(ArrayList<Integer> al) {
		Random any = new Random();
		int tryNum = any.nextInt(9) + 1;
		while (al.indexOf(tryNum) == -1) {
			tryNum = any.nextInt(9) + 1;
		}
		return tryNum;
	}

	
	void removeLastMove(ArrayList<Integer> al, int a) {

		int needRemove = al.indexOf(a);
		al.remove(needRemove);

	}

	
	void comticker(int tik) {

		if (tik == 1 || tik == 2 || tik == 3) {
			arr1[tik - 1] = 1;

		} else if (tik == 4 || tik == 5 || tik == 6) {
			arr2[tik - 4] = 1;

		} else if (tik == 7 || tik == 8 || tik == 9) {
			arr3[tik - 7] = 1;

		}

	}

	
	void myticker(int tik) {

		if (tik == 1 || tik == 2 || tik == 3) {
			arr1[tik - 1] = 2;

		} else if (tik == 4 || tik == 5 || tik == 6) {
			arr2[tik - 4] = 2;

		} else if (tik == 7 || tik == 8 || tik == 9) {
			arr3[tik - 7] = 2;

		}
	}

	boolean gameChecker(ArrayList<Integer> al) {

		if(al.size()==0) {
			System.out.println("무승부.풉!!");
			return true;
		}
		int square1 = arr1[0], square2 = arr1[1], square3 = arr1[2], square4 = arr2[0], square5 = arr2[1],
				square6 = arr2[2], square7 = arr3[0], square8 = arr3[1], square9 = arr3[2];

		boolean crow1 = (square1 == 1) && (square2 == 1) && (square3 == 1);
		boolean crow2 = (square4 == 1) && (square5 == 1) && (square6 == 1);
		boolean crow3 = (square7 == 1) && (square8 == 1) && (square9 == 1);
		boolean ccol1 = (square1 == 1) && (square4 == 1) && (square7 == 1);
		boolean ccol2 = (square2 == 1) && (square5 == 1) && (square8 == 1);
		boolean ccol3 = (square3 == 1) && (square6 == 1) && (square9 == 1);
		boolean cdig159 = (square1 == 1) && (square5 == 1) && (square9 == 1);
		boolean cdig357 = (square3 == 1) && (square5 == 1) && (square7 == 1);

		boolean mrow1 = (square1 == 2) && (square2 == 2) && (square3 == 2);
		boolean mrow2 = (square4 == 2) && (square5 == 2) && (square6 == 2);
		boolean mrow3 = (square7 == 2) && (square8 == 2) && (square9 == 2);
		boolean mcol1 = (square1 == 2) && (square4 == 2) && (square7 == 2);
		boolean mcol2 = (square2 == 2) && (square5 == 2) && (square8 == 2);
		boolean mcol3 = (square3 == 2) && (square6 == 2) && (square9 == 2);
		boolean mdig159 = (square1 == 2) && (square5 == 2) && (square9 == 2);
		boolean mdig357 = (square3 == 2) && (square5 == 2) && (square7 == 2);

		if (crow1 || crow2 || crow3 || ccol1 || ccol2 || ccol3 || cdig159 || cdig357) {
			System.out.println("computer 승리!!!");
			return true;
		} else if (mrow1 || mrow2 || mrow3 || mcol1 || mcol2 || mcol3 || mdig159 || mdig357) {
			System.out.println("player 승리!!!");
			return true;
		}
		return false;
	}

	void printBoard() {
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TicTacTok ttt = new TicTacTok();
		ArrayList<Integer> possibles = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			possibles.add(i);
		}

		do {
			System.out.println("pc의 수");
			int comMove = ttt.canNum(possibles);
			ttt.comticker(comMove);
			ttt.removeLastMove(possibles, comMove);
			ttt.printBoard();
			if (ttt.gameChecker(possibles)) {
				break;
			}

			System.out.println("나의 수");
			int myMove = s.nextInt();
			while (possibles.indexOf(myMove) == -1) {
				System.out.println("이미있슴.다시 입력하세요");

				ttt.printBoard();

				myMove = s.nextInt();
			}
			ttt.myticker(myMove);
			ttt.removeLastMove(possibles, myMove);
			ttt.printBoard();

		} while (!ttt.gameChecker(possibles));
	

	}
}

