package p03;

public class GuGuDan {
	
	void printLoop(ObjectExam oe) {
		for(int i = 1; i < 10; i++ ) {
			for(int j = 1; j < 10; j++ ) {
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
