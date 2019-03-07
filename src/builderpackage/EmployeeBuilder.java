package builderpackage;

/**
 *
 * @author Alba
 */
public class EmployeeBuilder {
    private final String newFirstName;
    private final long newId;
    private String newLastName = " ";
    private String newMiddleName = " ";
    private int newBirthYear = 0;
    private int newBirthMonth = 0;
    private int newBirthDate = 0;
    private int newHireYear = 0;
    private int newHireMonth = 0;
    private int newHireDate = 0;

    public EmployeeBuilder(final String newFirstName, final long newId) {
        this.newFirstName = newFirstName;
        this.newId = newId;
    }

    public EmployeeBuilder setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }

    public EmployeeBuilder setNewMiddleName(String newMiddleName) {
        this.newMiddleName = newMiddleName;
        return this;
    }    
    
    public EmployeeBuilder setNewBirthYear(int newBirthYear) {
        this.newBirthYear = newBirthYear;
        return this;
    }

    public EmployeeBuilder setNewBirthMonth(int newBirthMonth) {
        this.newBirthMonth = newBirthMonth;
        return this;
    }

    public EmployeeBuilder setNewBirthDate(int newBirthDate) {
        this.newBirthDate = newBirthDate;
        return this;
    }

    public EmployeeBuilder setNewHireYear(int newHireYear) {
        this.newHireYear = newHireYear;
        return this;
    }

    public EmployeeBuilder setNewHireMonth(int newHireMonth) {
        this.newHireMonth = newHireMonth;
        return this;
    }

    public EmployeeBuilder setNewHireDate(int newHireDate) {
        this.newHireDate = newHireDate;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(newFirstName, newId, newLastName, newMiddleName, newBirthYear, newBirthMonth,
                newBirthDate, newHireYear, newHireMonth, newHireDate);
    }
}
