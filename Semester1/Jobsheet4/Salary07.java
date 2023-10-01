package Semester1.Jobsheet4;

import java.util.Scanner;

public class Salary07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int numAttendance, numAbsence, totalSalary, salary, salaryDeduction;

        System.out.print("Input salary: ");
        salary = input.nextInt();
        System.out.print("Input salary deduction: ");
        salaryDeduction = input.nextInt();
        System.out.println("Input attendance number: ");
        numAttendance = input.nextInt();
        System.out.println("Input absence number: ");
        numAbsence = input.nextInt();

        totalSalary=(numAttendance*salary)-(numAbsence*salaryDeduction);
        System.out.println("Total salary"+totalSalary);
    }
}
