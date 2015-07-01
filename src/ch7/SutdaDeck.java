package ch7;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < CARD_NUM; i++) {
			int num = i % 10 + 1;
			boolean isKwang = false;
			if (i < 10 && ((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 8)) {
				isKwang = true;
			}
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	public void shuffle() {

		for (int i = 0; i < CARD_NUM * 2; i++) {
			int index1 = (int) (Math.random() * 100) % CARD_NUM;
			int index2 = (int) (Math.random() * 100) % CARD_NUM;

			SutdaCard temp = new SutdaCard();
			temp = cards[index1];
			cards[index1] = cards[index2];
			cards[index2] = temp;
		}

	}

	public SutdaCard pick(int index) {
		return cards[index];
	}

	public SutdaCard pick() {
		return cards[(int) (Math.random() * 100) % CARD_NUM];
	}

}