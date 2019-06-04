package com.ensat.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ensat.entities.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {

}
