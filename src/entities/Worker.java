package entities;

import java.util.List;

import entities.enums.Workerlevel;

public class Worker {
	
	private String name;
	private Workerlevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts;
	
	public Worker() {
		
	}
	public Worker(String name, Workerlevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
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
	@Override
	public String toString() {
		return "Worker [name: " + name + ", Job Grade: " + level + ", Salary: " + baseSalary + "]";
	}
	
	public void AddContract() {
		
	}
	

}
