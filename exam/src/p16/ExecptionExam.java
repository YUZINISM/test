package p16;

public class ExecptionExam {

	public void convertAndPrint(String numStr) throws Exception {

		
			System.out.println(Integer.parseInt(numStr));
		
	}

	public static void main(String args[]) {

		ExecptionExam ee = new ExecptionExam();
		try {
			ee.convertAndPrint("!23");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("fnfnfnf");
		}
	}
}
