package programms;

 public class Student {
	
	 String id;
	 String name;
	 String standard;
	 String stateCode ;
	
	public Student(String id, String name , String standard, String stateCode ) {
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.stateCode = stateCode;
		
	}
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	

	public String getStandard() {
		return standard;
	}

	

	public String getStateCode() {
		return stateCode;
	}

	

	
	
}