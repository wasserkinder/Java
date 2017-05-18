package blatt3Aufgabe1;

public class main {

	public static void main(String[] args) {
		
		//Clone
		Fur Fur_Object = new Fur(10);
		Sheep schaf_Object = new Sheep("sheep1", Fur_Object);
		Sheep clone_sheep = schaf_Object.clone();
		System.out.println("first sheep : " + schaf_Object.toString());
		System.out.println("clone sheep: " + clone_sheep.toString());
		
		//Changing with clone		
		System.out.println("\nafter changing with clone: \n"); 
		clone_sheep.name = "sheep after shear";
		clone_sheep.shear();
		System.out.println("clone sheep: " + clone_sheep.toString());
		System.out.println("first sheep : " + schaf_Object.toString());
		
		//shallowClone
		Fur second_fur = new Fur(11);
		Sheep second_schaf = new Sheep("Sheep2", second_fur);
		Sheep shallowclone_sheep = second_schaf.shallowclone();
		System.out.println("second sheep : " + second_schaf.toString());
		System.out.println("shallowclone sheep: " + shallowclone_sheep.toString());
		
		//Changing with shallowClone		
		System.out.println("\nafter changing with shallowclone: \n"); 
		shallowclone_sheep.name = "sheep2 after shear";
		shallowclone_sheep.shear();
		System.out.println("shallowclone sheep: " + shallowclone_sheep.toString());
		System.out.println("second sheep : " + second_schaf.toString());
		
		//deepClone
		Fur third_fur = new Fur(12);
		Sheep third_schaf = new Sheep("Sheep3", third_fur);
		Sheep deepclone_sheep = second_schaf.deepclone();
		System.out.println("second sheep : " + third_schaf.toString());
		System.out.println("shallowclone sheep: " + deepclone_sheep.toString());
		
		//Changing with shallowClone		
		System.out.println("\nafter changing with deepclone: \n"); 
		shallowclone_sheep.name = "sheep3 after shear";
		shallowclone_sheep.shear();
		System.out.println("deepclone sheep: " + deepclone_sheep.toString());
		System.out.println("third sheep : " + third_schaf.toString());
		

		if(clone_sheep.equals(clone_sheep)){
			System.out.println(clone_sheep.name + " is type of sheep");	
		}else{
			System.out.println(clone_sheep.name + " is not type of sheep");
		}
		

		if(clone_sheep.equals(third_fur)){
			System.out.println(third_fur + " is type of sheep");	
		}else{
			System.out.println(third_fur + " is not type of sheep");
		}
	}
}
