



public class Intern extends Employee {
    private static final double SALARY_LIMIT = 20000.0;
    //Create an Intern class that extends from Employee. The Intern class should have a salary limit of 20000 (constant).
    //Implement validation in the Intern class to ensure that an intern is not created (or salary updated) with a salary that exceeds the maximum allowed value.
    //Write a program that creates 10 Employee objects and prints all of their properties (name, email, age, salary) to a file named employees.txt.
    //
    //Tips


    public Intern(String name,int age,String email) {
        super(name,age,email,SALARY_LIMIT);
    }

    public  void Validalidation(double SALARY_LIMIT, double salary){

        if (salary <= SALARY_LIMIT) {
            super.setSalary(salary);
        } else {
            System.out.println("Error: Intern's salary cannot exceed the maximum allowed salary of $" + SALARY_LIMIT);
        }


        }

    }


