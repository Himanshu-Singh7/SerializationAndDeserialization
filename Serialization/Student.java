package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name ;
   transient private String email;
    private int age;
    private String address;
    
    //Genrate getter and setter
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
    //Constructor
   public Student(String name , String email,int age ,  String address){
    	this.name = name ;
    	this.email = email;
    	this.age = age;
    	this.address = address;
    	
        }
    // default Constructor
	    public Student() {
	    	
	    }
	    
	    //Method 
	    public void display() {
	    	System.out.println("Hi my name is : " + this.name);
	    }
}
