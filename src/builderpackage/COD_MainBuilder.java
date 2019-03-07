package builderpackage;

/**
 *
 * @author Alba
 */
public class COD_MainBuilder {

    public static void main(String[] args) {
        
        Employee newEmployee;
        
        newEmployee = new EmployeeBuilder("juan",5L)
                .setNewBirthDate(15)
                .setNewBirthMonth(12)
                .setNewHireYear(1993)
                .setNewBirthYear(1960)
                .setNewHireDate(20)
                .setNewLastName("perez")
                .setNewMiddleName("jose")
                .createEmployee();
        
        System.out.println(newEmployee.toString());
    }
}
