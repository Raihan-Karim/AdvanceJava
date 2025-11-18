import java.time.LocalDate;

public class LeaveCount {

    private int vacation;
    private int sick;

    public LeaveCount(String employeeType, LocalDate joiningDate) {

        LocalDate endDate = LocalDate.of(2025, 12, 31);

        // Simple day calculation
        int days = endDate.getDayOfYear() - joiningDate.getDayOfYear() + 1;
        if (days < 0) days = 0;

        int totalDaysInYear = 365;

        // Direct type check (no isOfficer)
        int baseVacation;
        int baseSick;

        if ("Officer".equals(employeeType)) {
            baseVacation = 15;
            baseSick = 10;
        } else {
            baseVacation = 10;
            baseSick = 7;
        }

        // No Math.round — simple floor
        this.vacation = (int)((days * baseVacation) / (double) totalDaysInYear);
        this.sick     = (int)((days * baseSick)     / (double) totalDaysInYear);
    }

    public int getVacation() {
        return vacation;
    }

    public int getSick() {
        return sick;
    }
}
