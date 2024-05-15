import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtFather;
    private JComboBox<String> cbGender;
    private JTextField txtContact;
    private JTextField txtRollNo;
    private JTextField txtEmail;
    private JTextArea txtAddress;
    private JButton btSubmit;

    public Registration() {
        initializeComponents();
        setupFrame();
        addListeners();
    }

    private void initializeComponents() {
        contentPane = new JPanel(new GridLayout(0, 2, 10, 10));
        txtName = new JTextField();
        txtFather = new JTextField();
        cbGender = new JComboBox<>(new String[]{"Male", "Female"});
        txtContact = new JTextField();
        txtRollNo = new JTextField();
        txtEmail = new JTextField();
        txtAddress = new JTextArea(5, 20);
        btSubmit = new JButton("Submit");

        contentPane.add(new JLabel("Name:"));
        contentPane.add(txtName);
        contentPane.add(new JLabel("Father's Name:"));
        contentPane.add(txtFather);
        contentPane.add(new JLabel("Gender:"));
        contentPane.add(cbGender);
        contentPane.add(new JLabel("Contact:"));
        contentPane.add(txtContact);
        contentPane.add(new JLabel("Roll No:"));
        contentPane.add(txtRollNo);
        contentPane.add(new JLabel("Email:"));
        contentPane.add(txtEmail);
        contentPane.add(new JLabel("Address:"));
        JScrollPane scrollPane = new JScrollPane(txtAddress);
        contentPane.add(scrollPane);
        contentPane.add(btSubmit);
    }

    private void setupFrame() {
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Registration");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addListeners() {
        btSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });

        txtRollNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateEmail();
            }
        });
    }

    private void submitForm() {
        String info = "Name: " + txtName.getText() +
                "\nFather's Name: " + txtFather.getText() +
                "\nGender: " + cbGender.getSelectedItem().toString() +
                "\nContact: " + txtContact.getText() +
                "\nEmail: " + txtEmail.getText() +
                "\nAddress: " + txtAddress.getText();
        JOptionPane.showMessageDialog(this, info);
    }

    private void generateEmail() {
        String rollNo = txtRollNo.getText().trim();
        if (!rollNo.isEmpty()) {
            txtEmail.setText(rollNo + "@example.com");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Registration();
            }
        });
    }
}
