package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.repository.AddressRepository;
import com.evghenii.fitnesstudio.service.AddressService;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    private final MongoOperations mongoOperations;

    public AddressServiceImpl(AddressRepository addressRepository, MongoOperations mongoOperations) {
        this.addressRepository = addressRepository;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public List<Address> findByStreet(String street) {
        return addressRepository.findByStreet(street);
    }

    @Override
    public List<Address> findByCity(String city) {
        return addressRepository.findByCity(city);
    }

    @Override
    public List<Address> findByHausNummer(Integer hausnummer) {
        return addressRepository.findByHausNummer(hausnummer);
    }

    @Override
    public List<Address> findByCityAndStreet(String city, String street) {
        return addressRepository.findByCityAndStreet(city, street);
    }

    @Override
    public void deleteById(int id) {
        addressRepository.deleteById(id);
    }

    @Override
    public void deleteAddressByPerson(Person person) {
        addressRepository.deleteAddressByPerson(person);
    }

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }


    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public void update(Address address) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(address.getId()));
        Update update = new Update();
        update.set("city", address.getCity());
        update.set("street", address.getStreet());
        update.set("hausNummer", address.getHausNummer());
        mongoOperations.findAndModify(query, update, Address.class);
    }
}
