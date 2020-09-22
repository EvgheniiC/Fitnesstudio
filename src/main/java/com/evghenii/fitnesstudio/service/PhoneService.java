package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Phone;

public interface PhoneService {

    Phone findByPhoneNumber(String phoneNumber);
}
