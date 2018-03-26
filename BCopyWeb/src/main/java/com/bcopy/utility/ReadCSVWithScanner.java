package com.bcopy.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bcopy.vo.Employee;

public class ReadCSVWithScanner {

	public static void main(String[] args) throws IOException {
		// open file input stream

		CommonUtil c = new CommonUtil();

		BufferedReader reader = new BufferedReader(new FileReader(c.getFile("employees.csv")));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Employee> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			// create Employee Object
			Employee emp = new Employee();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setId(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setRole(data);
				else if (index == 3)
					emp.setSalary(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			// add data to employee arrayList one by one
			empList.add(emp);
		}

		// close reader
		reader.close();

		// ArrayList-[]
		// System.out.println(empList);

		// Iterate ArrayList
		for (Employee e : empList) {
			System.out.println(
					"Id:" + e.getId() + "\tName:" + e.getName() + "\tRole:" + e.getRole() + "\tSalay:" + e.getSalary());
		}

	}

}