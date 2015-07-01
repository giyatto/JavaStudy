package NHNNEXT;

public class Calculate {

	public static int sum(Car... cars) {
		int sum = 0;
		for (Car car : cars) {
			sum += car.getPrice();
		}
		return sum;
	}
}
