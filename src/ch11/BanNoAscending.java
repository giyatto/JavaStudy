package ch11;

import java.util.Comparator;

public class BanNoAscending implements Comparator {

	@Override
    public int compare(Object o1, Object o2) {
	    if(o1 instanceof Student && o2 instanceof Student){
	    	Student s1 = (Student) o1;
	    	Student s2 = (Student) o2;
	    	
	    	return s1.ban == s2.ban ? s1.no - s2.no : s1.ban-s2.ban;
	    }
		return -1;
    }

}
