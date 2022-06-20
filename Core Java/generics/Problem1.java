package com.cg.generics;

import java.util.HashSet;

class Employee {

	public int id;
	public String name;
	public String department;
	public Integer salary;

	Employee() {}

	public Employee(int id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	void displayDetails()
	{
		System.out.println("Details of the employee's are shown Below");
	}
}

public class Problem1{

	public static void main(String[] args) {
		
        Employee e4 = new Employee();
        e4.displayDetails();
        
		HashSet<Employee> set = new HashSet<Employee>();
		Employee e1 = new Employee(101,"Sam","RM",50000);
		Employee e2 = new Employee(102,"Roopa","AM",60000);
		Employee e3 = new Employee(103,"Devi","FM",40000);

		set.add(e1);
		set.add(e2);
		set.add(e3);
		for(Employee e:set)
		{
			System.out.println(e.id+" "+e.name+" "+e.department+" "+e.salary);
		}

	}
}



