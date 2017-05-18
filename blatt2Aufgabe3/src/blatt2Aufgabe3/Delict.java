package blatt2Aufgabe3;

public class Delict {
	 private int points; 
	 private double fees;
	 
	 public Delict(int p, double f){
		 setDelict(p, f);
	}
		public void setDelict(int p, double f){
			setPoints(p);
			setFees(f);
		}
		public void setPoints(int p){
			points = p;
		}
		public void setFees(double f){
			fees = f;
		}
		public int getPoints(){
			return points;
		}
		public double getFees(){
			return fees;
		}
		public String stringOfAllElements(){
			return String.format("points:" + getPoints() + "\nfees:" + getFees());
		}
}
