public class excercise1 {
    private int studentId;
    private String name;
    private String examId;

    // Getter and Setter methods
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        // Convert the input String to Integer for studentId
        this.studentId = Integer.parseInt(studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    // Method to generate Exam Id based on the given pattern
    public String generateExamId() {
        // Extract the first three letters of the first and last names
        String[] nameParts = name.split(" ");
        String firstNameLetters = nameParts[0].substring(0, 3);
        String lastNameLetters = nameParts[1].substring(0, 3);

        // Extract the last digit of the studentId and calculate its square
        int lastDigit = studentId % 10;
        int squareOfLastDigit = lastDigit * lastDigit;

        // Extract the last digit for the exam slot
        int examSlot = studentId % 10;

        // Generate the Exam Id based on the pattern
        String generatedExamId = firstNameLetters + "-" + lastNameLetters + ":" + studentId + "-" + squareOfLastDigit + examSlot;

        // Update the examId attribute
        setExamId(generatedExamId);

        return generatedExamId;
    }

    public static void main(String[] args) {
        // Create an object of Student class and initialize instance variables
        excercise1 student1 = new excercise1();
        student1.setStudentId("4596");
        student1.setName("John Whedon");

        // Generate and display the Exam Id
        System.out.println(student1.generateExamId());

        // Create another object of Student class and initialize instance variables
        excercise1 student2 = new excercise1();
        student2.setStudentId("3412");
        student2.setName("Ross Stark");

        // Generate and display the Exam Id
        System.out.println(student2.generateExamId());
    }
}
