package main.animals;


public class Pig {
private String name;
private String status;



	// CREATE the field "name" which is a String
	// CREATE the field "status" which is a String
	
	public Pig(String name, String status) {
		System.out.println("This is" + name "and it is" + status);
	}
	
	
	// Create getter and setter for name and status
	
	public void setName() {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setStatus() {
		this.status=status;
		
	}
	public String getStatus() {
		return status; 
	}
}

