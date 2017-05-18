package blatt2;
import java.util.Scanner;
public class ausgabe {
	public static  void main(String[] args){
		//create object of classes 
		fakultät faku = new fakultät();
		binomialkoeffizient bino = new binomialkoeffizient();
		lottoproblems lotto = new lottoproblems();
		//get a number and give factorial of the number 
		System.out.print("Enter the number:");
		Scanner input = new Scanner(System.in);
		long number ;
		number = input.nextLong();
		long a = faku.fakulFunc(5);
		System.out.println("factorial of entered number:"+ a);
		
		//get numbers and give binomial coefficient of numbers 
		System.out.print("Enter first number:");
		long n ;
		n = input.nextLong();
		System.out.print("Enter second number:");
		long k;
		k = input.nextLong();
		long b = bino.binomialFunc(n, k); 
		System.out.println("binomial coefficient of entered numbers:" + b);

		//get numbers and give Modified LottoProblems of numbers 
		System.out.print("Enter first number:");
		long n2 ;
		n2 = input.nextLong();
		System.out.print("Enter second number:");
		long k2;
		k2 = input.nextLong();
		long c = lotto.lottoFunc(n2, k2); 
		System.out.println("Modified LottoProblems of entered numbers:" + c);

	}
}
