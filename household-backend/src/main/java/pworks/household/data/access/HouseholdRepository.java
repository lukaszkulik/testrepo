package pworks.household.data.access;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pworks.household.data.domain.HouseholdDocument;

@Repository
public interface HouseholdRepository extends MongoRepository<HouseholdDocument, BigInteger> {
	
}
