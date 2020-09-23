package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Email;
import com.evghenii.fitnesstudio.domain.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends MongoRepository<Email, Integer> {
    void send(Program program);
}
