package com.ayasyaGst.generalController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyaGst.generalData.GeneralData;
import com.ayasyaGst.generaldataRepository.GeneralDataRepository;

@RestController
@RequestMapping(value="/api/v")
public class GeneralDataController {
	@Autowired
	GeneralDataRepository generalDataRepository;
	
	//send new data from post method.
	@RequestMapping(value="/newData", method = RequestMethod.POST)
	public ResponseEntity<String> newGeneralData(@RequestBody @Valid GeneralData generalData ){
		return new ResponseEntity<String>("success", HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/allGeneralData", method = RequestMethod.GET)
	public List<GeneralData> getAllGeneralData(){
		return generalDataRepository.findAll();
	}

}
