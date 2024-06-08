import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private LocalDate localDate;
    //Constrcutor the class,which take three values
    public Date(int month, int day, int year) {
        this.localDate = LocalDate.of(year, month, day);
    }
    // This function is using the java lib of DateTime formatter to format the code in the desired output.
    public Date(String month, int day, int year) {
        DateTimeFormatter formator = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        this.localDate = LocalDate.parse(month + " " + day + ", " + year, formator);
    }

    public Date(int dayOfYear, int year) {
        this.localDate = LocalDate.ofYearDay(year, dayOfYear);
    }

    public String tommddyyyy() {
        return localDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public String tomonthdayyear() {
        return localDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));
    }

    public String todddyyyy() {
        return localDate.format(DateTimeFormatter.ofPattern("DDD yyyy"));
    }

}

