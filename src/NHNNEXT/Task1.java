package NHNNEXT;

public class Task1 {
	public static void main(String[] args) {
		Sonata sonata = new Sonata(3);
		Grandeur grandeur = new Grandeur(2);
		Genesis genesis = new Genesis(1);
		System.out.println("모든 차의 가격 합은 " + Calculate.sum(sonata, grandeur, genesis) + " 입니다.");
	}
}
