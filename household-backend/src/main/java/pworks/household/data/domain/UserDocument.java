package pworks.household.data.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

import pworks.household.data.AbstractDocument;

@Document(collection="user")
public class UserDocument extends AbstractDocument {
	
	@Indexed(unique=true)
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	@Indexed(unique=true)
	private EmailAddress emailAddress;

	public UserDocument(String username, String firstName, String lastName, EmailAddress emailAddress) {
		super();
		Assert.hasText(username, "Username cannot not be empty!");
		Assert.hasText(firstName, "First name cannot not be empty!");
		Assert.hasText(lastName, "Last name cannot not be empty!");
		Assert.hasText(emailAddress.toString(), "E-mail address cannot not be empty!");
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	// ------------------------------------------------------------
	// -----	GETTERS & SETTERS	-------------------------------
	// ------------------------------------------------------------

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Assert.hasText(firstName, "First name cannot not be empty!");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Assert.hasText(lastName, "Last name cannot not be empty!");
		this.lastName = lastName;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUsername() {
		return username;
	}

}
