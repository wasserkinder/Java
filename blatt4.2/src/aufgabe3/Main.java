package aufgabe3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);
		
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		
		Food essen = new Cauliflower();
		student.eat(essen);

	}

}
