package blatt2Aufgabe3;

public class myprogram {
	public static  void main(String[] args){
		Car car1 = new Car("B-KN 4127", "Max M.", "Kreuzbergweg 2");
		Car car2 = new Car("K-LM 5135", "Simon S.", "Roemerstraße 164");
		TrafficOffice to1 = new TrafficOffice();
		to1.registerCar(car1);
		to1.registerCar(car2);
		// Sollte Max M. ausgeben::
		System.out.println(to1.getCar(car1.getLicensePlate()).getOwner());
		car2.registerDelict(new Delict(2, 48.5));
		car2.registerDelict(new Delict(0, 20.));
		// Sollte K-LM 5135 und Simon S. ausgeben:
		System.out.println("Delikte für " + car2.getLicensePlate() + " (" + car2.getOwner() + "):");
		// Sollte die zwei obigen Delikte ausgeben:
		car2.printDelicts();

	}
}
