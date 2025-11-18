import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee<Integer>> employees = new ArrayList<>();

        System.out.print("How many employees to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Employee " + (i + 1) + " Details");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("DOB (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Joining Date (yyyy-mm-dd): ");
            LocalDate joining = LocalDate.parse(sc.nextLine());

            System.out.print("Employee Type (Officer/Staff): ");
            String type = sc.nextLine();

            employees.add(new Employee<>(id, name, dob, email, joining, type));
        }

        System.out.println("\n===== ALL EMPLOYEE DETAILS =====");
        for (Employee<Integer> emp : employees) {
            emp.showDetails();
        }
    }
}

