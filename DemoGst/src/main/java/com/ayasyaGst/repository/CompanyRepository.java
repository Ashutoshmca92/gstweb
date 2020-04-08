package com.ayasyaGst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.entity.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	public Company getCompanyByName(String name);

}
