package aufgabe2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p1 = new point(1,2);
		point p2 = new point(3,4);
		System.out.println(p1.string());
		System.out.println(p2.string());
		System.out.println(p1.distance(p1,p2));
		point p3 = new Point3D(1,2,5);
		point p4 = new Point3D(3,4,5);
		System.out.println(p3.string());
		System.out.println(p4.string());
		System.out.println(p3.distance(p3,p4));
	}

}
