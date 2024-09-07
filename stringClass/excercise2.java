package stringClass;

public class excercise2 {
    private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public excercise2 change() {
        //Write your code here to implement the logic
        excercise2 student = new excercise2();
        student.setFirstName(this.firstName.trim());
         student.setLastName(this.lastName.trim());


         if(this.middleName.trim().isEmpty()){
            student.setMiddleName("N.A.");
         }else{
            student.setMiddleName(this.middleName.trim());
         }

         return student;
	}
	public String generateInitials() {
        //Write your code here to implement the logic
        excercise2 student = this.change();
        char firstNameInitial = student.firstName.charAt(0);
        char middleNameInitial = student.middleName.charAt(0);
        char lastNameInitial = student.lastName.charAt(0);

        String initials = ""+firstNameInitial+middleNameInitial+lastNameInitial;
        return initials;
	}

    public static void main(String[] args) {
	
		excercise2 std1=new excercise2();
		std1.setFirstName("Filius  ");
		std1.setMiddleName(" ");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());
		
		
	}

}
