package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
     public static void main(String[] args) {
		try {
			// Create object of Student
	    	 Student s = new Student("himanshu Singh","himanshusingh0608@gmail.com",26,"Varansi");
	    	// write data to file 
	    	 FileOutputStream fos = new FileOutputStream("ob.txt");
	    	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	    	 
	    	 //how to serilized
	    	 oos.writeObject(s);
	    	 oos.close();
	    	 fos.close();
	    	 System.out.println("Object started is transfer to file ob!!");
	    	 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
