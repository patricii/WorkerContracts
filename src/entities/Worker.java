package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Workerlevel;

public class Worker {

	private String name;
	private Workerlevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, Workerlevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Workerlevel getLevel() {
		return level;
	}

	public void setLevel(Workerlevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}

	

}
