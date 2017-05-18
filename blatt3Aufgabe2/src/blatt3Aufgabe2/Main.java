package blatt3Aufgabe2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food;
		food = new Cauliflower();
		System.out.println(food.getMeal());
		food = new Spaghetti();
		System.out.println(food.getMeal());
		food = new CheeseBerger();
		System.out.println(food.getMeal());

	}

}
