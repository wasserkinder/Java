package blatt3Aufgabe1;

public class Sheep {
	public String name;
	public Fur fur;
	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}
	public void shear() {
		fur.length = 0;
	}
	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	public Sheep clone() {
		return this;
	}
	
	public Sheep shallowclone(){
		return new Sheep(name,fur);
	}
	
	public Sheep deepclone(){
		return new Sheep(name, new Fur(this.fur.length));
	}
	
	public boolean equals(Object a){
		if(a instanceof Sheep){
			return true;
		}else{	
			return false;
		}
	}
}


