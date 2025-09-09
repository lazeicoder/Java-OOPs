/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Employee {
    private int empSalary;
    
    public String empName;
    
    public void setName(String name) {
        empName = name;
    }
    
    public void setSalary(int salary) {
        empSalary = salary;
    }
    
    public String getName() {
        return empName;
    }
    
    public int getSalary() {
        return empSalary;
    }
}

public class classandobject
{
	public static void main(String[] args) {
	    Employee emp1 = new Employee();
	    emp1.setName("Raj");
	    emp1.setSalary(34000);
	    
	    Employee emp2 = new Employee();
	    emp2.setName("Rahul");
	    emp2.setSalary(56000);
	    
	    System.out.println(emp1.getName() +" has salary: "+ emp1.getSalary());
	    System.out.println(emp2.getName() +" has salary: "+ emp2.getSalary());
	}
}
