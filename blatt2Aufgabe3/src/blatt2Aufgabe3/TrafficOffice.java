package blatt2Aufgabe3;

import java.util.ArrayList;

public class TrafficOffice {
	ArrayList<Car> cars = new ArrayList(); 
	Car notfound = new Car("notfount", "notfount", "notfount");
	public void registerCar(Car c){
	cars.add(c);		
	}
	public Car getCar(String licensePlate){
		int index = 1000;
		for(int i = 0; i < cars.size();  i++){
			if (new String(cars.get(i).getLicensePlate()).equals(licensePlate)){
				index = i;
			}
		}
		if (index != 1000){
		return cars.get(index);
		}else{
			return notfound;
		}
	}
}
