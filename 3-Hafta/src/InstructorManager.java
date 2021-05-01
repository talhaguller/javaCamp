package kodlama.io;

public class InstructorManager extends UserManager {
	String userName;
	
	public InstructorManager(int id, String name,String lastName, String lessonName, String userName) {
		this.id = id;
		this.name =name;
		this.lastName = lastName;
		this.lessonName= lessonName;
		this.userName = userName;
	}
	
	public void lessonCreat() {
		System.out.println(this.lessonName+": Dersiniz Olusturulmustur "+this.name+" "+this.lastName);
	}
	
	
}
