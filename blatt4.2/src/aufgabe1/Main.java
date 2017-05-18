package aufgabe1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Matrix2D m1 = new Matrix2D(2,3,-1,2);
		System.out.println(m1.toString());
		Operator alloperators[] = {new determinantOperator(), new traceOperator(),
		new symmetryOperator(), new transposeOperator()};
		for(Operator o : alloperators) {
		System.out.println("Ergebnis " + o.getClass().toString());
		System.out.println(m1.applyOperator(o).toString());	
		}

	}

}
