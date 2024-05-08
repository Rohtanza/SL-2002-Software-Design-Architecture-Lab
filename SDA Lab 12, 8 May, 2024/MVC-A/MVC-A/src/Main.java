
public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.setStudent();
        controller.updateView();
    }
}
