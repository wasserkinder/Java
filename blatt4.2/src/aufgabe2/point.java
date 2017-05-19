package aufgabe2;


public class point {
	double x, y;
	public point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(point p1, point p2){
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
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
	public String x_koordinate(){
		return String.valueOf(x);
	}
	public String y_koordinate(){
		return String.valueOf(y);
	}
	public String string(){
		return String.format("X: " + x_koordinate() + "\nY: " + y_koordinate(), null);
	}
}
