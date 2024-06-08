public class StudentController {
    private Student model;
    private Registration view;

    public StudentController(Student model, Registration view) {
        this.model = model;
        this.view = view;
        initView();
    }
    /*
    *   Sir this is the thing you were talking
    *   in the lab, we just need to call the
    *   listener within THIS class of the
    *   controller
    * */
    private void initView() {
        view.addSubmitButtonListener(e -> updateModelFromView());
        view.addViewButtonListener(e -> updateViewFromModel());
    }

    private void updateModelFromView() {
        model.setName(view.getName());
        model.setFatherName(view.getFatherName());
        model.setGender(view.getGender());
        model.setContact(view.getContact());
        model.setRollNo(view.getRollNo());
        model.setEmail(view.getEmail());
        model.setAddress(view.getAddress());

        System.out.println("Student Registered: " + model.getName());
    }

    private void updateViewFromModel() {
        view.displayStudentData(model);
    }
}
