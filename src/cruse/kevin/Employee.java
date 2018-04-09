package cruse.kevin;

public class Employee
{
    private String FirstName;
    private String LastName;
    private char EmployeeGender;
    private String PhoneNumber;
    private int EmployeeAge;
    public String EmployeeCollege;
    public Employee(String First, String Last, char Gender, String Phone, int Age, String College)
    {
        FirstName = First;
        LastName = Last;
        EmployeeGender = Gender;
        PhoneNumber = Phone;
        EmployeeAge = Age;
        EmployeeCollege = College;
    }
    public Employee()
    {
    }
    public void setFirstName(String First)
    {
        FirstName = First;
    }
    public void setLastName(String Last)
    {
        LastName = Last;
    }
    public void setEmployeeGender(char Gender)
    {
        EmployeeGender = Gender;
    }
    public void setPhoneNumber(String Phone)
    {
        PhoneNumber = Phone;
    }
    public void setEmployeeAge(int Age)
    {
        EmployeeAge = Age;
    }
    public void setEmployeeCollege(String College)
    {
        EmployeeCollege = College;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public char getEmployeeGender()
    {
        return EmployeeGender;
    }
    public String getPhoneNumber()
    {
        return PhoneNumber;
    }
    public int getEmployeeAge()
    {
        return EmployeeAge;
    }
    public String getEmployeeCollege()
    {
        return EmployeeCollege;
    }
}
