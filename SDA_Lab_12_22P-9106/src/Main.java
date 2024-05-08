public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        Registration view = new Registration();
        new StudentController(model, view);
    }
}
