package ch7;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("잔액이 부족하여 " + p.toString() + "을/를 살수 없습니다.");
			return;
		}
		this.money -= p.price;
		add(p);
	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			for (int k = 0; k < i; k++) {
				newCart[k] = cart[k];
			}
			cart = newCart;
		}
		cart[i] = p;
		i++;
	}

	void summary() {
		int sum = 0;

		System.out.print("구입한 물건 : ");
		for (int k = 0; k < i; k++) {
			sum += cart[k].price;
			System.out.print(cart[k].toString() + ", ");
		}
		System.out.println();

		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+ money);

	}
}
