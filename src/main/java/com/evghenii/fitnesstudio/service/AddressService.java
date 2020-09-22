package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Address;

import java.util.List;

public interface AddressService extends CRUDService<Address> {

    List<Address> findByStreet(String street);

    List<Address> findByCity(String city);

    List<Address> findByHausNummer(Integer hausnummer);

    List<Address> findByCityAndStreet(String city, String street);

}
