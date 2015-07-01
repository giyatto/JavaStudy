package ch7;

public class Circle extends Shape{

	private double r;
	
	Circle(double r){
		this.r = r;
	}
	
	
	@Override
    double calcArea() {
	    return r*r*Math.PI;
    }

}
