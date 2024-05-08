import javax.swing.*;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

    public String[] setStudentDetails(){
        String []stDetails = new String[2];
        stDetails[0] = JOptionPane.showInputDialog("Enter Name:");
        stDetails[1] = JOptionPane.showInputDialog("Enter Roll No:");
        return stDetails;
    }
}