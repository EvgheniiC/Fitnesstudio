package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, Integer> {
}
