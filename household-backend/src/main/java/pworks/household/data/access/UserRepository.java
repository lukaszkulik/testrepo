package pworks.household.data.access;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pworks.household.data.domain.UserDocument;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, BigInteger> {


}
