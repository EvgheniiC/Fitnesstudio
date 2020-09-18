package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Email;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Email, Integer> {
}
