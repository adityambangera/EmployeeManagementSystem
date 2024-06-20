import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmployeeManager {
	private ArrayList<Employee> employees;
	private static Logger logger = Logger.getLogger(EmployeeManager.class.getName());

	public EmployeeManager() {
		employees = new ArrayList<>();
		setupLogger();
	}

	private void setupLogger() {
		try {
			FileHandler fileHandler = new FileHandler("D:\\JAVA Projects\\Logs\\employee_management.log", true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (IOException e) {
			System.err.println("Failed to set up logger: " + e.getMessage());
		}
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
		logger.info("Added employee: " + employee);
	}

	public void removeEmployee(int id) {
		employees.removeIf(employee -> employee.getId() == id);
		logger.info("Removed employee with ID: " + id);
	}

	public void viewEmployees() {
		logger.info("Viewing all employees");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
