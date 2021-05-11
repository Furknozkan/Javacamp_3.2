public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFırstName("Furkan");
		student.setLastName("Özkan");
		
		User user = new User();
		user.setFırstName("Ahmet");
		user.setLastName("Yılmaz");
		user.setAge(28);
		
		
		
		Instructor ınstructor = new Instructor();
		ınstructor.setFırstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setCertificate("MCT,PMP,ITIL");
		
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.removeUser();
		studentManager.addUser();
		
		
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.addCourse();
		ınstructorManager.removeCourse();
		ınstructorManager.updateCourse();
		
		
		
		UserManager userManager = new UserManager();
		userManager.addUser();
		userManager.removeUser();
		
	
	}

}
