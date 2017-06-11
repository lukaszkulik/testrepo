package pworks.household.data.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

import pworks.household.data.AbstractDocument;

@Document(collection="household")
public class HouseholdDocument extends AbstractDocument {
	
	private List<Todo> todos = new ArrayList<>();
	
	@DBRef
	private Set<UserDocument> users = new HashSet<>();

	
	public HouseholdDocument() {
		super();
	}
	
	public HouseholdDocument(UserDocument createdBy) {
		Assert.notNull(createdBy, "User cannot be null!");
		addUser(createdBy);
	}
	
	// ------------------------------------------------------------
	// -----	GETTERS & SETTERS	-------------------------------
	// ------------------------------------------------------------

	public List<Todo> getTodos() {
		return todos;
	}

	public Set<UserDocument> getUsers() {
		return users;
	}
	
	public void addUser(UserDocument user) {
		this.users.add(user);
	}
}
