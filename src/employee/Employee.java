package employee;

/**
 * Created by islama1 on 7/1/18.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private String phoneNumber;
    private String address;

    public Employee(String firstName, String lastName, int employeeID, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Employee(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +" with employeeID '" +  employeeID + " , phone number: " + phoneNumber + " and address: " +  address ;
    }
}
