import java.util.*;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


 class Employee {
  private String name;
  private Integer age;
  private Double salary;
  public Employee(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  public String toString(){
    return "Employee Name:"+this.name
        +"  Age:"+this.age
        +"  Salary:"+this.salary;
  }
public int getAge() {
	if(this.age>30) {
	return 31;
	}
	else
	{
		return 29;
	}
}

}
 
public class hashmap6 {
  static List<Employee> employeeList = new ArrayList<>();
  public static void main(String[] args) {
    employeeList.add(new Employee("ss", 45, 7000.00));
    employeeList.add(new Employee("ss1", 25, 10000.00));
    employeeList.add(new Employee("ss2", 65, 8000.00));
    employeeList.add(new Employee("ss3", 22, 12000.00));
    employeeList.add(new Employee("ss4", 29, 9000.00));
    employeeList.removeIf((Employee emp) -> emp.getAge() >  30);
    System.out.println("Employees below the age of 30");
        employeeList.forEach(System.out::println);
  }
}
