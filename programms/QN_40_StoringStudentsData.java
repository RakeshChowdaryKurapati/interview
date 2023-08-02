package programms;

import java.util.*;

public class QN_40_StoringStudentsData {

	public static void main(String[] args) {
		
		
		
		ArrayList<Student> student = new ArrayList<>();
		
		student.add(new Student("000","Scott","PG", "AP"));
		student.add(new Student("001","Rakesh","PG", "AP"));
		student.add(new Student("002","Amar","UG", "TN" ));
		student.add(new Student("003","Ashok","10th","TG" ));
		student.add(new Student("004","Harvey","Law","DL" ));
		student.add(new Student("005","MykeRoss","MBA", "DL" ));
		student.add(new Student("006","Rachel","PG", "AP" ));
		student.add(new Student("007", "Donna", "Law", "DL"));
		
		for (Student st : student) {
			System.out.println(st.getName()+", "+st.getId()+", "+st.getStandard()+", "+st.getStateCode());
		}
		
	}
	
	
}
