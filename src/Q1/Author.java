package Q1;

public class Author {
	//The private instance variables
	private String name;
	private String email;
	private char gender;  //'m' or 'f'
	
	/** Constructs a Author instance with the given inputs */
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}
		
	//The public getters and setters for the private for the private instance variables.
	//No setter for name and gender as they are not designed to be changed.
	public String getName(){
		return name;
	}
    /** Sets the email */
	public void setEmail(String email){
		this.email = email;
	}
	/** Returns a self-descriptive String */
	public String toString(){
		return name + " (" + gender + ") at " + email;
	}

	public String getGender1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}

}
