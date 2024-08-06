//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = Task9.isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }
    }
}

