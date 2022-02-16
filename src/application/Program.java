package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//usa a interface list com a classe employee e depois instancia com a classe ArrayList
		List <employee> list = new ArrayList<>();
		char ans = '*';
		
		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type the id first: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Type the name: ");
			String name = sc.nextLine(); 
			System.out.print("Type the salary: ");
			double salary = sc.nextDouble();
			//para cada objeto funcionario add um membro à list instanciando a classe tipo referência com os atributos antes coletados
			list.add(new employee(id, name, salary));
		}	
		
		System.out.println("List of Employees: ");
		for (employee x : list) { //for each employee "x" in list
			System.out.printf(x.toString());
		}
		
		System.out.print("Increase someone's salary? y/n: ");
		ans = sc.next().charAt(0);
		if (ans == 'y') {
				System.out.print("ID: ");
				int id = sc.nextInt();
				Integer pos = listPosition(list, id);
				if (pos == null) { System.out.println("Id failed"); }
				else {
						System.out.print("Percentage of increase: ");
						double percentage = sc.nextDouble();
						list.get(pos).increaseSalary(percentage);
					 }
		}
		
		for (employee x : list) {
			System.out.printf(x.toString()); }
		
	sc.close(); }
	
	//achar posição 
	public static Integer listPosition(List<employee> list,int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) { 
				return i; }
			}
	return null;	
	}
}

