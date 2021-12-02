package Scannerclass;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DAOR {
	public void saveStudent(Student std1) {
		try {
		FileWriter fw =new FileWriter("D:\\Slokam\\one\\two\\1.txt",true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(std1.getID()+" "+std1.getName()+" "+std1.getQulification()+" "+std1.getAge());
		bw.newLine();
		bw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
