
public class User {
	 private String email;
	 private String firstName;
	 private String lastName;
	 private String passWord;
	 private String birthDay;
	 private String userNumber;
	  
	public User () {}
	
	public User (String email,String firstName,String lastName, String passWord, String birthDay, String userNumber) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.userNumber = userNumber;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
}
