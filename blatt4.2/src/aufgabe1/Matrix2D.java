package aufgabe1;

import java.util.Arrays;

public class Matrix2D {
	double[][] matrix;
	public Matrix2D(double...werte){
		int n = (int) Math.ceil(Math.sqrt(werte.length));
		int k = 0; 
		
		matrix = new double[n][n];
		fill:for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					try {
						matrix[i][j] = werte[k];
						k++;
					}catch(Exception ArrayIndexOutOfBoundsExeception){
						break fill;
					}
			}
		}
	}
	public Matrix2D(double[][] a){
		int n = a.length;
		
		matrix = new double[n][n];

	}
	public double[][] getMatrix(){
		return matrix;
	}
	
	public Matrix2D clone() {
		return new Matrix2D() {
		};
	}
	
	public String toString(){
		String ret = new String();
		for(int i = 0; i < matrix.length; i++){
			ret += Arrays.toString(matrix[i]) + "\n";
			
		}
		return ret;
	}
	public Object applyOperator(Operator o) {
		return o.execute(this);
		}

}