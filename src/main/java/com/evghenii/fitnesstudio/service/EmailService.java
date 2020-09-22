package com.evghenii.fitnesstudio.service;

import com.evghenii.fitnesstudio.domain.Program;

public interface EmailService {
    void send(Program program);
}
