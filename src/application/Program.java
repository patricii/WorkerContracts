package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.Workerlevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter Departments name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("name: ");
		String workerName = sc.nextLine();
		System.out.print("Job Grade: ");
		String WorkerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		System.out.println();
		
		Worker worker = new Worker(workerName, Workerlevel.valueOf(WorkerLevel), baseSalary, new Department(departmentName));

		System.out.print("How many contracts to this worker: ");
		int workerContracts = sc.nextInt();
		
		for (int i = 1; i<= workerContracts ; ++i ) {
			System.out.println("Enter contract #" + i + " Data: ");
			System.out.print("Date (DD/MM/YYYY) : ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour : ");
			double valuePerHourWorker = sc.nextDouble();
			System.out.print("Duration (hours) : ");
			int duration = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHourWorker, duration);
			worker.AddContract(contract);
		}				
		sc.close();
	}

}
