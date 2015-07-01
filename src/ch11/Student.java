package ch11;

public class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int total; // 총점
	int schoolRank; // 전교등수
	int classRank;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage() + "," + schoolRank + "," + classRank;
	}

	@Override
	public int compareTo(Object o) {
		// if (o instanceof Student) {
		// Student tmp = (Student) o;
		// return name.compareTo(tmp.name);
		// } else {
		// return -1;
		// }

		if (o instanceof Student) {
			Student tmp = (Student) o;
			return tmp.total - this.total; // 총점 기준(내림차순)으로 정렬한다.
		}else{
			return -1;
		}
	}

}
