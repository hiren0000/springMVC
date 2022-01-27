package springmvc.Model;

public class User 
{
	private String name;
	private String Email;
	private int phoneNumber;
	
	public User()
	{
		
	}

	public User(String name, String email, int phoneNumber) {
		super();
		this.name = name;
		Email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", Email=" + Email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	


}
