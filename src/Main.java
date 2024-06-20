public class Main {
	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();

		Employee emp1 = new Employee("Alice", 1, "HR");
		Employee emp2 = new Employee("Bob", 2, "Engineering");
		Employee emp3 = new Employee("Charlie", 3, "Marketing");

		manager.addEmployee(emp1);
		manager.addEmployee(emp2);
		manager.addEmployee(emp3);

		System.out.println("All Employees:");
		manager.viewEmployees();

		System.out.println("\nRemoving Employee with ID 2:");
		manager.removeEmployee(2);

		System.out.println("All Employees:");
		manager.viewEmployees();
	}
}
