package programms;

import java.util.ArrayList;

public class QN_45_StudentsDetailsWhoseSTATECODE_is_DL_And_StartsWith_A {

	public static void main(String[] args) {

		ArrayList<Student> student = new ArrayList<>();

		student.add(new Student("000","Scott","PG", "AP"));
		student.add(new Student("001","Rakesh","PG", "AP"));
		student.add(new Student("002","Amar","UG", "TN" ));
		student.add(new Student("003","Ashok","10th","TG" ));
		student.add(new Student("004","Harvey","Law","DL" ));
		student.add(new Student("005","MykeRoss","MBA", "DL" ));
		student.add(new Student("006","Rachel","PG", "AP" ));
		student.add(new Student("007", "AngelDonna", "Law", "DL"));

		for (Student st : student) {
			if(st.stateCode.equals("DL") && st.name.startsWith("A")){
				System.out.println(st.getName()+", "+st.getId()+", "+st.getStandard()+", "+st.getStateCode());
			}
		}
	}
}
