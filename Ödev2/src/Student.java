
public class Student extends User{
	private String F�rstName;
	private String LastName;
	
	
	public Student() {
		
	}
	
	

	public Student(String f�rstName, String lastName) {
		super();
		this.F�rstName = f�rstName;
		this.LastName = lastName;
	}




	public String getF�rstName() {
		return F�rstName;
	}




	public void setF�rstName(String f�rstName) {
		F�rstName = f�rstName;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
