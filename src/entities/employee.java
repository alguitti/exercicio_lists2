package entities;

public class employee {
	private int id;
	private String name;
	private double salary;
	
public employee() {} //construtor padrão

public employee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary; 
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public double getSalary() {
	return salary;
}

public void increaseSalary(double percentage) {
	salary += salary*(percentage/100);
}

public String toString() {
	return "ID: "
			+ id
			+ ", "
			+ name
			+ ", R$"
			+ String.format("%.2f%n", salary);
}

}
