package com.ayasyaGst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.entity.State;
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
