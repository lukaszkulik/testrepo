package pworks.household.data.domain;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.util.Assert;

public final class EmailAddress {
	
	@Field("emailAddress")
	private final String value;
	
	public EmailAddress(String value) {
		Assert.isTrue(isValid(value), "Email address has invorrect format!");
		this.value = value;
	}
	
	private boolean isValid(String emailAddress) {
		return true;
	}
	
	
	// ------------------------------------------------------------
	// -----	GETTERS & SETTERS	-------------------------------
	// ------------------------------------------------------------
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
