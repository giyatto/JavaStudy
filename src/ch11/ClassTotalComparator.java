package ch11;

import java.util.Comparator;

public class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		int result = s1.ban - s2.ban; // 반(ban) 기준 정렬(오름차순)
		if(result==0){
			result = s2.total - s1.total;
		}
		return result;
	}
}
