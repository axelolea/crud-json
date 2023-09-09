package com.axelolea.crudjson.bean;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, U> {

    T save (T i);
    Optional<T> findById(U id);
    List<T> findAll();
    void delete (U id);
    T update (U id, T t);

}
