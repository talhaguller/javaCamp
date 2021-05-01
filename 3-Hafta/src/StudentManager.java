package kodlama.io;

public class StudentManager extends UserManager{
	String email;
	
	public StudentManager(int id, String name,String lastName, String lessonName, String email) {
		this.id = id;
		this.name =name;
		this.lastName = lastName;
		this.lessonName= lessonName;
		this.email=email;
	}
	
	
	public void lessonAdd() {
		System.out.println(this.lessonName+": Dersiniz Kayit Olunmustur  "+this.name+" "+this.lastName);
	}
	

}
