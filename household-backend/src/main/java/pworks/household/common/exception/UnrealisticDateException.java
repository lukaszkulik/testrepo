package pworks.household.common.exception;

import java.util.Date;

public class UnrealisticDateException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public UnrealisticDateException(Date completeToDate) {
		super(completeToDate.toString());
	}
}
