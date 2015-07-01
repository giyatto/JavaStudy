package ch6;

public class SutdaCard {

	private int num;
	private boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + ( isKwang? "K" : "");
	}

}
