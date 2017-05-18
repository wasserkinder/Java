package aufgabe1;

public class determinantOperator implements Operator {
	 public double[] add(double[] a, double[] b) {
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	            a[i] += b[i];
	        }
	        return a;
	    }
	    public double[] mult(double[] a, double s) {
	        int n = a.length;
	        double[] tmp = new double[n];
	        for (int i = 0; i < n; i++) {
	            tmp[i] = a[i] * s;
	        }
	        return tmp;
	    }
	    public double[] swap(double[] a, double[] b) {
	        return a;
	    }
	    public Object execute(Matrix2D matrix) {
	        Matrix2D tmp = matrix.clone();
	        double[][] m = tmp.getMatrix();
	        int n = m.length;
	        double produkt = 1;
	        int swapped = 1;
	        /*
	         * Falls in einer Zelle eine Null steht, durch die später dividiert
	         * werden soll, wird diese getauscht.
	         */
	        for (int i = 0; i < n - 1; i++) {
	            if (m[i][i] == 0) {
	                int swap = 0;
	                for (int j = 0; j < n; j++) {
	                    if (j != i && m[j][i] != 0) {
	                        m[i] = swap(m[j], m[j] = m[i]);
	                        swap++;
	                        swapped *= -1;
	                    }
	                }
	                if (swap == 0) {
	                    return 0;
	                }
	            }
	        }
	        // Gauß-Algorithmus
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                double c = -m[j][i] / m[i][i];
	                m[j] = add(m[j], mult(m[i], c));
	            }
	        }
	        // Produkt der Diagonalen
	        for (int i = 0; i < n; i++) {
	            produkt *= m[i][i];
	        }
	        return swapped * produkt;
	    }
}
