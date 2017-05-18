package blatt2Aufgabe3;

import java.util.ArrayList;

public class Car {
	private String licensePlate;
	private String owner;
	private String address;
	
	public Car(String l, String o, String a){
		setCar(l, o, a);
	}
	public void setCar(String l, String o, String a){
		setLicensePlate(l);
		setOwner(o);
		setAddress(a);
	}
	public void setLicensePlate(String l){
		licensePlate = l; 
	}
	public void setOwner(String o){
		owner = o; 
	}
	public void setAddress(String a){
		address = a; 
	}
	public String getLicensePlate(){
		return licensePlate;
	}
	public String getOwner(){
		return owner;
	}
	public String getAddress(){
		return address;
	}
	public String stringOfAllElements(){
		return String.format("licensePlate:" + getLicensePlate() + "\nowner:" + getOwner() + "\naddress:" + getAddress());
	}
	
	ArrayList<Delict> delict = new ArrayList();
	public void registerDelict(Delict d){
	delict.add(d);		
	}
	public void printDelicts(){
		for(int i = 0 ; i < delict.size(); i++){
			System.out.println("pionts:" + delict.get(i).getPoints());
			System.out.println("fees:" + delict.get(i).getFees());
		}
	}
}
