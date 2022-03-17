import java.util.UUID;

public class User {
	private UUID id;
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	
	public User(String userName, String firstName, String lastName, int age, String phoneNumber) 
	{
		this.id = UUID.randomUUID();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public User(UUID id, String userName, String firstName, String lastName, int age, String phoneNumber) 
	{
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public User(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
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
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setID (UUID id)
	{
		this.id = id;
	}

	public void setUserName (String userName)
	{
		this.userName = userName;
	}

	public void setAge (int age)
	{
		this.age = age;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}