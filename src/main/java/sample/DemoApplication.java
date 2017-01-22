package sample;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by takunnithan on 10/3/16.
 */
public class DemoApplication {

    /**
     * Creates and returns a list of employees
     * @return list of employees
     */
    public static List<Employee> createEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("234", "John", 2500));
        employeeList.add(new Employee("264", "Mike", 5500));
        employeeList.add(new Employee("144", "Tom", 4000));
        employeeList.add(new Employee("334", "Frank", 3000));

        return employeeList;
    }

    /**
     * Raise employee's salary by 20%.
     * @param employees List of employees
     */
    public static void salaryRaise(List<Employee> employees){
        for(Employee employee : employees){
            double salaryRaise = employee.getSalary() + employee.getSalary() * .2 ;
            employee.setSalary(salaryRaise );
        }
    }

    /**
     * Display the details of employee
     * @param employees List of employees
     */
    public static void displayEmployee(List<Employee> employees){
        for(Employee employee: employees){
            System.out.println("Employee name:" + employee.getEmpName());
            System.out.println("Employee Id:" + employee.getEmpId());
            System.out.println("Salary: "+ employee.getSalary());
            System.out.println("--------------------------------------------");
        }
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);

        // Creating a list of employees
        List<Employee> employeeList = createEmployee();
        logger.info("Employee list created");

        // Raise salary by 20 %
        salaryRaise(employeeList);

        // Display the employee details
        displayEmployee(employeeList);


    }
}
