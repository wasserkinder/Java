package blatt2;

public class fakultät {
	public static long fakulFunc(long a){
		if(a>1){
			return a * fakulFunc(a-1);
		}else{
			return 1;
		}
	}
}
