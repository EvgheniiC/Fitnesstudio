package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Phone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhoneRepository extends MongoRepository<Phone, Integer> {
}
