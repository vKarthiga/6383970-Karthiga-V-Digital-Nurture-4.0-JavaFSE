package mvc;

public class Main {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student();
        student.setId("S101");
        student.setName("Karthiga");
        student.setGrade("A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        System.out.println("\n-- Updating student data --");
        controller.setStudentName("Karthiga V");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
    }
}
