package blatt2;

public class binomialkoeffizient {
	public static long binomialFunc(long n, long k){
		fakultät faku = new fakultät();
		long result = faku.fakulFunc(n)/(faku.fakulFunc(k)*faku.fakulFunc(n-k));
		return result;
	}

}
