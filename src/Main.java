
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        File f1 = new File("employees.txt");
        FileWriter writer = new FileWriter("employee.txt", true);


        ArrayList<Employee> employees = new ArrayList<>();


        employees.add(new Employee("Ahmed", 30, "Ahmed@gmail.com", 1200));
        employees.add(new Employee("Nada", 30, "nada@gmail.com", 300));
        employees.add(new Employee("Muna", 30, "Muna@gmail.com", 4000));
        employees.add(new Employee("John", 30, "John@gmail.com", 200));
        employees.add(new Employee("Khlood", 30, "Khlood@gmail.com", 200));
        employees.add(new Employee("Sarah", 30, "Sarah@gmail.com", 200));
        employees.add(new Employee("Ayfer", 30, "Ayfer@gmail.com", 200));
        employees.add(new Employee("Maram", 30, "Maram@gmail.com", 200));
        employees.add(new Employee("Huda", 22, "Huda@gmail.com", 400));


        for (Employee employee : employees) {
            String employeeInfo = "Name: " + employee.getName() + ", Age: " + employee.getAge() +", Email: " + employee.getEmail() +", Salary: " + employee.getSalary() + "\n";
            writer.write(employeeInfo);

        }
writer.close();
    }

}
