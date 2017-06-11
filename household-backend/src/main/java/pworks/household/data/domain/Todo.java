package pworks.household.data.domain;

import java.math.BigInteger;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.util.Assert;

import pworks.household.common.Priority;
import pworks.household.common.Status;
import pworks.household.common.exception.UnrealisticDateException;

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
		Assert.hasText(itself, "TODO cannot not be empty!");
		this.itself = itself;
	}

	public Date getCompleteToDate() {
		return completeToDate;
	}

	public void setCompleteToDate(Date completeToDate) throws UnrealisticDateException {
		if(completeToDate.before(DateTime.now().toDate())) {
			throw new UnrealisticDateException(completeToDate);
		}
		this.completeToDate = completeToDate;
	}

	public Date getCompleteOnDate() {
		return completeOnDate;
	}

	public void setCompleteOnDate(Date completeOnDate) throws UnrealisticDateException {
		if(completeOnDate.before(DateTime.now().toDate())) {
			throw new UnrealisticDateException(completeToDate);
		}
		this.completeOnDate = completeOnDate;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		Assert.notNull(priority, "Priority cannot be empty!");
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
		Assert.notNull(status, "Status cannot be empry!");
		this.status = status;
	}
}
