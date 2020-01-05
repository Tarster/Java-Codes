import java.lang.System;

// Base Class
class Employee {
	public int base ;

Employee()
{
	base = 10000;
}

Employee (int new_base)
{
	this.base=new_base;
}

	int salary()
	{
		return base;
	}
}

// Inherited class
class Manager extends Employee {

	int salary()
	{
		return base + 20000;
	}
}

// Inherited class
class Clerk extends Employee {


	int salary()
	{
		return base + 10000;
	}
}

class Boss extends Employee
{
Boss(int new_Salary)
{
	super(new_Salary);
}

int salary()
{
	return base;
}

}

// Driver class
class Inheritance	 {

	static void printSalary(Employee e)
	{
		System.out.println(e.salary());
	}

	public static void main(String[] args)
	{
		Employee obj3 =new Boss(10000000);
		System.out.print("Boss salary :");
		printSalary(obj3);

		Employee obj1 = new Manager();
		System.out.print("Manager's salary : ");
		printSalary(obj1);

		Employee obj2 = new Clerk();
		System.out.print("Clerk's salary : ");
		printSalary(obj2);


	}

}
