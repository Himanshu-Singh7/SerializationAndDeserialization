package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerilise {
    public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ob.txt");
			ObjectInputStream obis = new ObjectInputStream(fis);
			Student student	=(Student)obis.readObject();
			student.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
