package p03;

public class GuGuDan {
	
	public void printLoop(ObjectExam oe) {
		for(int i = 1; i < oe.num1; i++ ) {
			for(int j = 1; j < oe.num2; j++ ) {
				String str = "["+ j + "x" + i +"]";
				if(j!=9) {
					str = str + ",";
				}
				System.out.print(str);
			}		
			System.out.println("");
		}
	}
	
	

}
