import java.util.UUID;

/**
 * A user
 */
public class User {
	private UUID id;
	private String userName;
	private String firstName;
	private String lastName;
	private String age;
	private String phoneNumber;

	/**
	 * An instance of a user
	 * 
	 * @param userName    The user's username
	 * @param firstName   The user's first name
	 * @param lastName    The user's last name
	 * @param age         The user's age
	 * @param phoneNumber The user's phone number
	 */
	public User(String userName, String firstName, String lastName, String age, String phoneNumber) {
		this.id = UUID.randomUUID();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * An instance of a user
	 * 
	 * @param id          The user's ID
	 * @param userName    The user's username
	 * @param firstName   The user's first name
	 * @param lastName    The user's last name
	 * @param age         The user's age
	 * @param phoneNumber The user's phone number
	 */
	public User(UUID id, String userName, String firstName, String lastName, String age, String phoneNumber) {
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * An instance of a user
	 * 
	 * @param firstName The user's first name
	 * @param lastName  The user's last name
	 */
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Gets the user's ID
	 * 
	 * @return id The user's ID
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the users's ID
	 * 
	 * @param id The user's ID
	 */
	public void setID(UUID id) {
		this.id = id;
	}

	/**
	 * Gets the user's username
	 * 
	 * @return userName The user's username
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user's username
	 * 
	 * @param userName The user's username
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the user's first name
	 * 
	 * @return firstName The user's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the user's first name
	 * 
	 * @param firstName The user's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the user's last name
	 * 
	 * @return lastName The user's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the user's last name
	 * 
	 * @param lastName The user's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the user's age
	 * 
	 * @return age The user's age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Sets the user's age
	 * 
	 * @param age The user's age
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * Gets the user's phone number
	 * 
	 * @return phoneNumber The user's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the user's phone number
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}