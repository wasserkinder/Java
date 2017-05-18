package aufgabe2;

public class Point3D extends point {
	double z;
	public Point3D(double x, double y, double z){
		super(x,y);
		z = this.z;
	}
	public double distance(Point3D p1, Point3D p2){
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		double z = p1.z - p2.z;
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + + Math.pow(z, 2)));
	}
	public point getpoint(){
		return this;
	}
	public double getx(){
		return this.x;
	}
	public double gety(){
		return this.y;
	}
	public double getz(){
		return this.z;
	}
	public String x_koordinate(){
		return String.valueOf(x);
	}
	public String y_koordinate(){
		return String.valueOf(y);
	}
	public String z_koordinate(){
		return String.valueOf(z);
	}
	public String string(){
		return String.format("X: " + x_koordinate() + "\nY: " + y_koordinate() + "\nZ: " + z_koordinate());
	}
}
