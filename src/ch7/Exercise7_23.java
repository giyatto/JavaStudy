package ch7;

public class Exercise7_23 {

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));
	}

	private static Double sumArea(Shape[] arr) {
		double sumOfArea = 0;
		for (Shape s : arr) {
			sumOfArea += s.calcArea();
		}
		return sumOfArea;
	}

}
