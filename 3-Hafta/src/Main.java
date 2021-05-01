package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager(1,"Engin","Demirog","Java Yazilim Kampi","engindemirog");
		instructorManager.lessonCreat();
		
		StudentManager studentManager = new StudentManager(1, "Talha", "Guller", "Java YAzilim Kampi", "talha@gmail.com");
		studentManager.lessonAdd();
		
		
		
		
		
	}

}
