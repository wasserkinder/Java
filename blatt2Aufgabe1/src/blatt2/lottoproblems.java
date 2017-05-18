package blatt2;

public class lottoproblems {
	public static long lottoFunc(long n, long k){
		binomialkoeffizient bino = new binomialkoeffizient();
		fakultät fakul = new fakultät();
		long result = bino.binomialFunc(n, k) * fakul.fakulFunc(k);
		return result;
	}
}
