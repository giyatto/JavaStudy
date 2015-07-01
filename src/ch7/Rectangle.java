package ch7;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	
	@Override
    double calcArea() {
	    return width * height;
    }
	
	public boolean isSquare() {
		if(width == height){
			return true;
		}
		return false;
	}

}
