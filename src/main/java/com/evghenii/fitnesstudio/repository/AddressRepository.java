package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address, Integer> {

    List<Address> findByStreet(String street);

    List<Address> findByCity(String city);

    List<Address> findByHausNummer(Integer hausnummer);

    List<Address> findByCityAndStreet(String city, String street);

}
