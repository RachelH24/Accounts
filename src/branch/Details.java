package branch;

public class Details {

	private String firstName;
	private String lastName;
	private int accountNumber;

	public Details(int accountNumber2, String firstName2, String lastName2) {

		this.accountNumber = accountNumber2;
		this.firstName = firstName2;
		this.lastName = lastName2;

	}
	public String toString() {
		
		return firstName + " " + lastName + " " + accountNumber;
		
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

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
