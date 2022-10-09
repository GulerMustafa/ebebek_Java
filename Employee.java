import java.util.Scanner;

class Employee {
	public static void main(String arg[]) {
		Employee employees = new Employee();
		employees.Employees();
	}
	public void Employees(){
		String name;
		double salary, workHours, hireYear, netSalary;
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		name = input.nextLine();
		System.out.println("Enter salary");
		salary = input.nextDouble();
		System.out.println("Enter working hours");
		workHours = input.nextDouble();
		System.out.println("What year have you started the job?");
		hireYear = input.nextDouble();

		netSalary = tax(salary);
		netSalary += bonus(workHours);
		netSalary += netSalary * raiseSalary(hireYear);
		System.out.println(name + "'s " + "Salary is =" + " " + netSalary);
	}

	static double tax(double salary) {
		double taxs = salary;

		if (salary < 1000) {
			taxs = salary;
		} else {
			taxs *= 0.97;
		}
		return taxs;
	}

	static double bonus(double workHours) {
		double bonusw = workHours;

		if (bonusw > 40) {
			bonusw -= 40;
			bonusw *= 30;
		}
		return bonusw;
	}

	static double raiseSalary(double hireYear) {
		double yearb = (hireYear - 2021);

		if (yearb < 10) {
			yearb = 0.05;
		} else if (yearb > 9 && yearb < 20) {
			yearb = 0.1;
		} else {
			yearb = 0.15;
		}
		return yearb;
	}
}