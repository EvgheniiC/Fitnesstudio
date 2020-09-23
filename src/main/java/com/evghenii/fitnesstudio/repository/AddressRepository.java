package com.evghenii.fitnesstudio.repository;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends MongoRepository<Address, Integer> {

    List<Address> findByStreet(String street);

    List<Address> findByCity(String city);

    List<Address> findByHausNummer(Integer hausnummer);

    List<Address> findByCityAndStreet(String city, String street);

    void deleteById(Integer id);

    void deleteAddressByPerson(Person person);

}
