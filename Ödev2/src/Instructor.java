
public class Instructor {
	private String fýrstName;
	private String lastName;
	private String certificate;
	
	public Instructor() {
		
		
	}
	
	
	public Instructor(String fýrstName, String lastName, String certificate) {
		super();
		this.fýrstName = fýrstName;
		this.lastName = lastName;
		this.certificate = certificate;
	}


	public String getFýrstName() {
		return fýrstName;
	}


	public void setFýrstName(String fýrstName) {
		this.fýrstName = fýrstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCertificate() {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	

}
