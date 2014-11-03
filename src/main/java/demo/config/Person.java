package demo.config;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;



@Entity("users")
public class Person {


	@Id
	private String id; 
	
	
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param role
	 */
	public Person(String username, String password,
			String firstName, String lastName, int role) {
		this.setUsername(username);
		this.setPassword(password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setRole(role);
	}
	public Person(){}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int role;
}
