package com.bcopy.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bcopy.vo.Copy;
import com.bcopy.vo.Employee;
/*
public class ReadCSVCopyFile {

	public static void main(String[] args) throws IOException {
		// open file input stream

		CommonUtil c = new CommonUtil();

		BufferedReader reader = new BufferedReader(new FileReader(c.getFile("cm23MAR2018bhav.csv")));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Copy>copyList = new ArrayList();

		
		int iteration = 0;
		while ((line = reader.readLine()) != null) {
			//skip first row 
			if(iteration == 0) {
		        iteration++;  
		        continue;
		    }
			// create Copy Object
			Copy copy = new Copy();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			
			while (scanner.hasNext()) {
				String id=scanner.next();
				String symbol = scanner.next();
				String open = scanner.next();
				String high = scanner.next();
				String low = scanner.next();
				String close = scanner.next();
				String last = scanner.next();
				String tottrdqty = scanner.next();
				String preclose = scanner.next();
				String createddate = scanner.next();
				String isin = scanner.next();
				String  totaltrade= scanner.next();

				if (index == 0)
					copy.setId(Integer.parseInt(id));
				
				else if (index == 1)
					copy.setSymbol(symbol);
				
				else if (index == 2)
					copy.setSeries(data);

				else if (index == 3)
					copy.setOpen(open);

				else if (index == 4)
					copy.setHigh(data);

				else if (index == 5)
					copy.setLow(data);
				else if (index == 6)
					copy.setClose(data);

				else if (index == 7)
					copy.setLast(data);

				else if (index == 8)
					copy.setPreclose(preclose);

				else if (index == 9)
					copy.setTottrdqty(tottrdqty);

				else if (index == 10)
					copy.setCreatedDate(createdDate);

				else if (index == 11)
					copy.setTotaltrade(totaltrade);

				else if (index == 12)
					copy.setIsin(isin);

				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			// add data to copy arrayList one by one
			copyList.add(copy);
		}

		// close reader
		reader.close();

		// ArrayList-[]
		// System.out.println(empList);

		// Iterate ArrayList
		for (Copy copy : copyList) {
			System.out.println(
					"Id:" + copy.getId() + "\t:" + copy.getSymbol() + "\t:" + copy.get+ "\tSalay:" + e.getSalary());
		}

	}

}*/