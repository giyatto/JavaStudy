package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_9 {
	public static void calculateClassRank(List list) {
		// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();

		for (int i = 0; i < length; i++) {
			Student std = (Student) list.get(i);

			if (std.ban != prevBan) {
				prevRank = -1;
				prevTotal = -1;
			}
			if (std.total == prevTotal) {
				prevRank = std.classRank;
			} else {
				std.classRank = i + 1;
			}
			prevBan = std.ban;
			prevTotal = std.total;
			prevRank = std.classRank;
		}

	} // public static void calculateClassRank(List list) {

	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		for (int i = 0; i < length; i++) {
			Student std = (Student) list.get(i);
			if(std.getTotal() == prevTotal){
				std.schoolRank = prevRank;
			}
			else {
				std.schoolRank = i + 1;
			}
			prevRank = std.schoolRank;
			prevTotal = std.total;
		}
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
