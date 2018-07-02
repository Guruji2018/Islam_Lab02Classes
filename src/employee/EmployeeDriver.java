package employee;

/**
 * Created by islama1 on 7/1/18.
 */
public class EmployeeDriver {
    public static void main(String[] args) {
        Employee empObject01 = new Employee("Michael","Downey",50988,"6602240486", "9277 Fairway Drive, Apt#208, Des Plaines, IL");
        System.out.println("Employee Details");
        System.out.println("Employee ID: "+empObject01.getEmployeeID());
        System.out.println("Name: " + empObject01.getFirstName() +" "+ empObject01.getLastName());
        System.out.println("Address: "+empObject01.getAddress());
        System.out.println("Contact Number: "+empObject01.getPhoneNumber());
        System.out.println("**************************************************\n");
// created the employee object with no-argument constructor
        Employee empObject02 = new Employee();
        System.out.println("Employee Details");
        System.out.println("Employee ID: "+empObject02.getEmployeeID());
        System.out.println("Name: " + empObject02.getFirstName() +" "+ empObject02.getLastName());
        System.out.println("Address: "+empObject02.getAddress());
        System.out.println("Contact Number: "+empObject02.getPhoneNumber());
        System.out.println();
        System.out.println("When string is not initialized, the default value is null");
        System.out.println("When int is not initialized, the default value is 0");
        System.out.println("**************************************************\n");
// now set the value of attributes for the empObject02
        empObject02.setEmployeeID(12354);
        empObject02.setFirstName("Julie");
        empObject02.setLastName("Clark");
        empObject02.setPhoneNumber("9494949494");
        empObject02.setAddress("1231 University Drive, Apt#60, Kansas, MO");
        System.out.println("Testing toString() method of Employee class:\n"+empObject02.toString());
    }
}
