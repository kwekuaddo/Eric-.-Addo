package Q4;

import Q1.Author;

public class TestAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Author dan = new Author("Sydney Amoah", "sydnezamoah@gmail.com", 'm');
		      System.out.println(dan);  // toString()
		      //Tan Ah Teck (m) at teck@nowhere.com

		      // Test Setters and Getters
		      dan.setEmail("sydnezamoah@gmail.com");
		      System.out.println(dan);  // toString()
		      //Tan Ah Teck (m) at teck@somewhere.com
		      System.out.println("name is: " + dan.getName());
		      //name is: 
		      System.out.println("gender is: " + dan.getGender());
		      //gender is: m
		      System.out.println("email is: " + dan.getEmail());
		      //email is: teck@somewhere.com
	}

}
