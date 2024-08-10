import java.util.Scanner;

class EMPLOYEE {

    private int employeeNumber;
    private String employeeName;
    private double basic;
    private double DA;
    private double IT;
    private double netSal;

    public void readData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        employeeNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = scanner.nextDouble();

        calcNetSal();
    }


    private void calcNetSal() {
        DA = 0.52 * basic;
        double grossSal = basic + DA;
        IT = 0.30 * grossSal;
        netSal = grossSal - IT;
    }


    public void printData() {
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Dearness Allowance-DA: " + DA);
        System.out.println("Income Tax -IT: " + IT);
        System.out.println("Net Salary: " + netSal);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        EMPLOYEE[] employees = new EMPLOYEE[N];


        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            employees[i] = new EMPLOYEE();
            employees[i].readData();
        }

        System.out.println("\nEmployee details:");
        for (EMPLOYEE employee : employees) {
            employee.printData();
            System.out.println();
        }

        scanner.close();
    }
}
