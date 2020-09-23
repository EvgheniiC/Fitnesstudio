package com.evghenii.fitnesstudio.service.impl;

import com.evghenii.fitnesstudio.domain.Address;
import com.evghenii.fitnesstudio.domain.Person;
import com.evghenii.fitnesstudio.repository.AddressRepository;
import com.evghenii.fitnesstudio.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
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
}
