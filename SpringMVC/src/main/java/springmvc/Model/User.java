package springmvc.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String Email;
	private int phoneNumber;
	private byte[] avatar;
	
	public User()
	{
		
	}

	public User(int id, String name, String email, int phoneNumber, byte[] avatar) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		this.phoneNumber = phoneNumber;
		this.avatar = avatar;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", Email=" + Email + ", phoneNumber=" + phoneNumber + "]";
	}
	
	


}
