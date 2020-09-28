package com.evghenii.fitnesstudio.service;

import java.util.List;

public interface CRUDService<T> {
    void save(T t);

    void deleteById(int id);

    List<T> findAll();

    void update(T t);
}
