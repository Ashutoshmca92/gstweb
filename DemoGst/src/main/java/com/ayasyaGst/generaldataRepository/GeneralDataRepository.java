package com.ayasyaGst.generaldataRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.generalData.GeneralData;

@Repository
public interface GeneralDataRepository extends JpaRepository<GeneralData, Long> {
	
	

}
