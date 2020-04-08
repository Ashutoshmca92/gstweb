package com.ayasyaGst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
