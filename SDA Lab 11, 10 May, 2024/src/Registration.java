import javax.swing.*;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private JPanel contentPane;
    private JTextField txtName = new JTextField();
    private JTextField txtFather = new JTextField();
    private JComboBox<String> cbGender = new JComboBox<>(new String[]{"Male", "Female", "Other"});
    private JTextField txtContact = new JTextField();
    private JTextField txtRollNo = new JTextField();
    private JTextField txtEmail = new JTextField();
    private JTextArea txtAddress = new JTextArea();
    private JButton btSubmit = new JButton("Submit");
    private JButton btView = new JButton("View");

    public Registration() {
        contentPane = new JPanel();
        this.setContentPane(contentPane);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        contentPane.add(new JLabel("Name"));
        contentPane.add(txtName);
        contentPane.add(new JLabel("Father's Name"));
        contentPane.add(txtFather);
        contentPane.add(new JLabel("Gender"));
        contentPane.add(cbGender);
        contentPane.add(new JLabel("Contact"));
        contentPane.add(txtContact);
        contentPane.add(new JLabel("Roll No"));
        contentPane.add(txtRollNo);
        contentPane.add(new JLabel("Email"));
        contentPane.add(txtEmail);
        contentPane.add(new JLabel("Address"));
        contentPane.add(txtAddress);
        contentPane.add(btSubmit);
        contentPane.add(btView);

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Student Registration Form");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addSubmitButtonListener(ActionListener listenForSubmitButton) {
        btSubmit.addActionListener(listenForSubmitButton);
    }

    public void addViewButtonListener(ActionListener listenForViewButton) {
        btView.addActionListener(listenForViewButton);
    }

    public void displayStudentData(Student student) {
        txtName.setText(student.getName());
        txtFather.setText(student.getFatherName());
        cbGender.setSelectedItem(student.getGender());
        txtContact.setText(student.getContact());
        txtRollNo.setText(student.getRollNo());
        txtEmail.setText(student.getEmail());
        txtAddress.setText(student.getAddress());
    }

    public String getName() { return txtName.getText(); }
    public String getFatherName() { return txtFather.getText(); }
    public String getGender() { return (String) cbGender.getSelectedItem(); }
    public String getContact() { return txtContact.getText(); }
    public String getRollNo() { return txtRollNo.getText(); }
    public String getEmail() { return txtEmail.getText(); }
    public String getAddress() { return txtAddress.getText(); }
}
