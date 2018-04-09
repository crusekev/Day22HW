package cruse.kevin;

public class Main
{

    public static void main(String[] args)
    {
        Employee MyEmployee = new Employee();
        Employee MyEmployee2 = new Employee();
        MyEmployee.setFirstName("Tracie");
        MyEmployee.setLastName("Cruse");
        MyEmployee.setEmployeeGender('F');
        MyEmployee.setPhoneNumber("256-666-1337");
        MyEmployee.setEmployeeAge(69);
        MyEmployee.setEmployeeCollege("University of Alabama Huntsville");
        MyEmployee2.setFirstName("Jackson");
        MyEmployee2.setLastName("Cruse");
        MyEmployee2.setEmployeeGender('M');
        MyEmployee2.setPhoneNumber("256-123-4567");
        MyEmployee2.setEmployeeAge(26);
        MyEmployee2.setEmployeeCollege("Athens State");
        System.out.println("First Name: " + MyEmployee.getFirstName());
        System.out.println("Last Name: " + MyEmployee.getLastName());
        System.out.println("Gender: " + MyEmployee.getEmployeeGender());
        System.out.println("Phone Number: " + MyEmployee.getPhoneNumber());
        System.out.println("Age: " + MyEmployee.getEmployeeAge());
        System.out.println("Attended College: " + MyEmployee.getEmployeeCollege());
        System.out.println();
        System.out.println("First Name: " + MyEmployee2.getFirstName());
        System.out.println("Last Name: " + MyEmployee2.getLastName());
        System.out.println("Gender: " + MyEmployee2.getEmployeeGender());
        System.out.println("Phone Number: " + MyEmployee2.getPhoneNumber());
        System.out.println("Age: " + MyEmployee2.getEmployeeAge());
        System.out.println("Attended College: " + MyEmployee2.getEmployeeCollege());
    }

}