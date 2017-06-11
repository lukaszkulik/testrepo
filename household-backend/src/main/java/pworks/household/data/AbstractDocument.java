package pworks.household.data;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;

public class AbstractDocument {
	
	@Id
	private BigInteger id;
	
	public BigInteger getId() {
		return id;
	}

}
