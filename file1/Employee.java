
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee<T> {

    private T id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private LocalDate joiningDate;
    private String employeeType; // "Officer" or "Staff"
    private LeaveCount leave;

    public Employee(T id, String name, LocalDate dob, String email, LocalDate joiningDate, String empType) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dob;
        this.email = email;
        this.joiningDate = joiningDate;
        this.employeeType = empType;
        this.leave = new LeaveCount(empType, joiningDate);
    }

    public void showDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("DOB        : " + dateOfBirth);
        System.out.println("Email      : " + email);
        System.out.println("Joining    : " + joiningDate);
        System.out.println("Type       : " + employeeType);
        System.out.println("Vacation   : " + leave.getVacation());
        System.out.println("Sick       : " + leave.getSick());
        System.out.println("--------------------------------------------------");
    }
}
