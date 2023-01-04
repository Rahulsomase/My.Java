package Question3;

public class Collage {

	private String clgName;
	private Student student; 
	private String clgAdd;
	
	private String message;
	
	
	public Collage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collage(String clgName, Student student, String clgAdd) {
		super();
		this.clgName = clgName;
		this.student = student;
		this.clgAdd = clgAdd;
	}
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getClgAdd() {
		return clgAdd;
	}
	public void setClgAdd(String clgAdd) {
		this.clgAdd = clgAdd;
	}

	public Student setStudent(int i, String string, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
