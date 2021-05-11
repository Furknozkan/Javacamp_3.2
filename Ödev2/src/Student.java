
public class Student extends User{
	private String FýrstName;
	private String LastName;
	
	
	public Student() {
		
	}
	
	

	public Student(String fýrstName, String lastName) {
		super();
		this.FýrstName = fýrstName;
		this.LastName = lastName;
	}




	public String getFýrstName() {
		return FýrstName;
	}




	public void setFýrstName(String fýrstName) {
		FýrstName = fýrstName;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
