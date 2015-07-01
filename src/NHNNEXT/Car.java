package NHNNEXT;

public class Car {
	private int price;
	private int quantity;
	private static Car car;

	public Car(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public static Car getInstance(int price, int quantity) {
		if (car == null) {
			car = new Car(price, quantity);
		}
		return car;
	}
}
