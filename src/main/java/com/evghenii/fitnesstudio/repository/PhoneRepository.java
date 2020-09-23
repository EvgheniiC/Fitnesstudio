package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Phone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends MongoRepository<Phone, Integer> {

    Phone findByPhoneNumber(String phoneNumber);

}
