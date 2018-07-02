package employeeSalary;

import java.util.Scanner;

/**
 * Created by islama1 on 7/1/18.
 */
public class EmployeeSalaryDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for hourly rate: ");
        double hourlyRate = scan.nextDouble();
        System.out.println("Enter the value for insurance rate: ");
        double insuranceRate = scan.nextDouble();
        System.out.println("Enter the value for tax rate: ");
        double taxRate = scan.nextDouble();
        System.out.println("Enter the value for bonus: ");
        double bonus  = scan.nextDouble();

        EmployeeSalary employeeSalaryObj1 = new EmployeeSalary(hourlyRate, bonus, insuranceRate, taxRate);
        System.out.println("The details of employeeSalaryObj1 object are as follows:");
        System.out.println(employeeSalaryObj1.toString());
        System.out.println("The monthly salary of the employee is: $" + employeeSalaryObj1.monthlySalary());
        System.out.println("The monthly insurance of the employee is: $" + employeeSalaryObj1.monthlyInsurance());
        System.out.println("The annual gross salary of the employee is: $"+ employeeSalaryObj1.annualGrossSalary());
        System.out.println("The gross annual net pay of the employee is: $" + employeeSalaryObj1.annualNetPay());
        System.out.println();

        System.out.println("************************************************************************************");

        EmployeeSalary employeeSalaryObj2 = new EmployeeSalary();
        System.out.println();
        System.out.println("The details of employeeSalaryObj2 object are as follows:");
        System.out.println(employeeSalaryObj2.toString());
        employeeSalaryObj2.setHourlyRate(42.85);
        employeeSalaryObj2.setInsuranceRate(15.30);
        employeeSalaryObj2.setTaxRate(11.55);
        employeeSalaryObj2.setBonus(6344.66);
        System.out.println(employeeSalaryObj2.toString());
        System.out.println("The monthly salary of the employee is: $" + employeeSalaryObj2.monthlySalary());
        System.out.println("The monthly insurance of the employee is: $" + employeeSalaryObj2.monthlyInsurance());
        System.out.println("The annual gross salary of the employee is: $"+ employeeSalaryObj2.annualGrossSalary());
        System.out.println("The gross annual net pay of the employee is: $" + employeeSalaryObj2.annualNetPay());

    }
}
