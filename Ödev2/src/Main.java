public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setF�rstName("Furkan");
		student.setLastName("�zkan");
		
		User user = new User();
		user.setF�rstName("Ahmet");
		user.setLastName("Y�lmaz");
		user.setAge(28);
		
		
		
		Instructor �nstructor = new Instructor();
		�nstructor.setF�rstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setCertificate("MCT,PMP,ITIL");
		
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.removeUser();
		studentManager.addUser();
		
		
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addCourse();
		�nstructorManager.removeCourse();
		�nstructorManager.updateCourse();
		
		
		
		UserManager userManager = new UserManager();
		userManager.addUser();
		userManager.removeUser();
		
	
	}

}
