package enumClass;
enum Grade{
	A,B,C,D,E;
}
public class CalculateScolarship {
    
// defining enum Grade



	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;
	//Grade is the name of enum
	
	private float scholarshipAmount;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScolarshipAmount() {
		return scholarshipAmount;
	}
	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}
	
	public void calculateGrade() {
        if (totalMarks >= 250) {
            grade = Grade.A;
        } else if (totalMarks >= 200 && totalMarks < 250) {
            grade = Grade.B;
        } else if (totalMarks >= 175 && totalMarks < 200) {
            grade = Grade.C;
        } else if (totalMarks >= 150 && totalMarks < 175) {
            grade = Grade.D;
        } else {
            grade = Grade.E;
        }
	}
	
	public void calculateScolarshipAmount() {
        switch (grade) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;
            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            case E:
                scholarshipAmount = 0; // Not Applicable
                break;
            default:
                break;
        }
	}



    public static void main(String[] args) {
       CalculateScolarship student = new CalculateScolarship();
       student.setStudentId(1000);
       student.setName("Alvin");
       student.setTotalMarks(280);
       student.calculateGrade();
       student.calculateScolarshipAmount();
       System.out.println("Student Details");
       System.out.println("***************");
       System.out.println("Student Id : "+student.getStudentId());
       System.out.println("Name : "+student.getName());
       System.out.println("Grade : "+student.getGrade());
       System.out.println("Scholarship Amount : "+student.getScolarshipAmount());
       
    

}
}
