package employeeSalary;

/**
 * The {@code EmployeeSalary} class represents an employee class
 *
 * @author  Azka Islam
 */

public class EmployeeSalary {
    private double hourlyRate;
    private double bonus;
    private double insuranceRate;
    private double taxRate;
    private final int HOURS = 40;

    public EmployeeSalary() {
    }

    /**
     * constructor initializing the values
     *
     * @param hourlyRate - the hourly rate of the employee
     * @param insuranceRate - the insurance rate
     * @param taxRate - the tax rate
     * @param bonus - annual bonux
     */
    public EmployeeSalary(double hourlyRate, double bonus, double insuranceRate, double taxRate) {
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
    }

    /**
     * returns the hourlyRate
     *
     * @return hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * sets the hourlyRate value
     *
     * @param hourlyRate - hourly rate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * returns the bonus
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * sets the bonus value
     *
     * @param bonus - yearly bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * returns the insurance rate
     *
     * @return insurance rate
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * sets the insurance rate value
     *
     * @param insuranceRate - inusrance rate
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /**
     * returns the taxRate
     *
     * @return taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * sets the tax rate value
     *
     * @param taxRate - tax rate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * returns the hourly rate
     *
     * @return hourly rate
     */
    public int getHOURS() {
        return HOURS;
    }

    /**
     * calculates and returns the monthly salary
     *
     * @return monthly salary
     */
    public double monthlySalary(){
        return hourlyRate * HOURS * 4;
    }

    /**
     * calculates and returns the monthlySalary
     *
     * @return monthly salary
     */
    public double monthlyInsurance(){
        return monthlySalary() * insuranceRate /100;
    }

    /**
     * calculates and returns the annual gross salary
     *
     * @return monthly annual gross salary
     */
    public double annualGrossSalary(){
        return (monthlySalary() * 12) + bonus;
    }

    /**
     * calculates and returns the annual net pay
     *
     * @return annual net pay
     */
    public double annualNetPay(){
        return (annualGrossSalary() - annualGrossSalary() * taxRate/100) - (monthlyInsurance()*12) ;
    }

    /**
     * returns a string containing hourlyRate, insuranceRate, taxRate and bonus
     *
     * @return string with variables
     */
    @Override
    public String toString(){
        return "Hourly pay rate: $" + hourlyRate + ", insurance rate:" +  insuranceRate + "%, tax: " + insuranceRate +  "%, annual bonus: $" + bonus + ", Hours per week: " + HOURS;
    }
}
