package pworks.household.data.domain;

import java.math.BigInteger;
import java.util.Date;

import pworks.household.common.Priority;
import pworks.household.common.Status;

public class Todo {
	
	private String itself;
	
	private Date completeToDate;
	
	private Date completeOnDate;
	
	private Priority priority;
	
	private BigInteger userId;
	
	private Status status;

	public Todo(String itself, Priority priority, Status status) {
		super();
		this.itself = itself;
		this.priority = priority;
		this.status = status;
	}
	
	// ------------------------------------------------------------
	// -----	GETTERS & SETTERS	-------------------------------
	// ------------------------------------------------------------

	public String getItself() {
		return itself;
	}

	public void setItself(String itself) {
		this.itself = itself;
	}

	public Date getCompleteToDate() {
		return completeToDate;
	}

	public void setCompleteToDate(Date completeToDate) {
		this.completeToDate = completeToDate;
	}

	public Date getCompleteOnDate() {
		return completeOnDate;
	}

	public void setCompleteOnDate(Date completeOnDate) {
		this.completeOnDate = completeOnDate;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
