package lamda;

public class Student {
	private int id;
	private String fullName;
	private String school;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Student(int id, String fullName, String school) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", school=" + school + "]";
	}
	
	
	
	
	
}
