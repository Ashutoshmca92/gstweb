package com.ayasyaGst.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyaGst.entity.City;
import com.ayasyaGst.entity.Company;
import com.ayasyaGst.entity.Country;
import com.ayasyaGst.entity.State;
import com.ayasyaGst.itemException.ResourceNotFoundException;
import com.ayasyaGst.model.GstData;
import com.ayasyaGst.repository.CityRepository;
import com.ayasyaGst.repository.CompanyRepository;
import com.ayasyaGst.repository.CountryRepository;
import com.ayasyaGst.repository.StateRepository;

@RestController
@RequestMapping(value = "/api")
public class CompanyController {
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(CompanyController.class);
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	CountryRepository countryRepository;
	@Autowired
	StateRepository stateRepository;
	@Autowired
	CityRepository cityRepository;

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public ResponseEntity<String> createData(@RequestBody GstData gstData) {
		Company company = new Company();
		company.setId(gstData.getCompanyId());
		company.setName(gstData.getCompanyName());
		company.setEmail(gstData.getEmail());
		company.setAddress(gstData.getAddress());
		company.setMobile(gstData.getMobile());
		company.setDescription(gstData.getDiscription());
		companyRepository.save(company);

		Country country = new Country();
		country.setName(gstData.getCountry());
		countryRepository.save(country);

		State state = new State();
		state.setName(gstData.getState());
		stateRepository.save(state);

		City city = new City();
		city.setName(gstData.getCity());
		city.setPinCode(gstData.getPinCode());
		cityRepository.save(city);

		return new ResponseEntity<String>("success 200", HttpStatus.OK);
	}

	// @RequestMapping(value="/company", method=RequestMethod.GET)
	@RequestMapping(value = "/allcompany", method = RequestMethod.GET)
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

	// http://localhost:8081/api/company?id=1 -> for single company details show
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public ResponseEntity<Object> getCompany(@RequestParam(value = "id") Long id) {
		Optional<Company> companyById = companyRepository.findById(id);
		if (companyById.isPresent()) {
			return ResponseEntity.ok(companyById.get());
		} else {
			return ResponseEntity.badRequest().body("\"No company data with specified id \" + id + \" found\"");

		}
	}
	
	// save Company  by name and find name
	
	public ResponseEntity<Object> saveCompanyByName(@RequestParam(value = "cname") String cname) {
		

		
	Company com=companyRepository.getCompanyByName("select  * from Company as com  where com.Name ="+cname);
	
	if(com!=null && com.getId()>0) {
		return ResponseEntity.ok(com);
	}else {
		
	}
		return ResponseEntity.badRequest().body("\" Company has been already exits with this name \" + id + \" found\"");
		
	}
	
	
	@RequestMapping(value="/country", method= RequestMethod.GET)
	public List<Country> getAllCountry(){
		return countryRepository.findAll();
	}

	@RequestMapping(value = "allState", method = RequestMethod.GET)
	public List<State> getAllState() {
		return stateRepository.findAll();

	}

	@RequestMapping(value = "/state/{id}", method = RequestMethod.GET)
	ResponseEntity<List<State>> listAllState() {
		List<State> states = stateRepository.findAll();
		if (states.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<State>>(states, HttpStatus.OK);
	}

	@RequestMapping(value = "/state/", method = RequestMethod.GET)
	public ResponseEntity getState(@RequestParam(value = "id") Long id) {
		Optional<State> foundState = stateRepository.findById(id);
		if (foundState.isPresent()) {
			return ResponseEntity.ok(foundState.get());
		} else {
			return ResponseEntity.badRequest().body("\"No state presents with specified id \" + id + \" found\"");
		}
	}
	
	@RequestMapping(value="/allCity", method= RequestMethod.GET)
	public List<City> getAllCity(){
		return cityRepository.findAll();
	}
	@RequestMapping(value="/city/", method=RequestMethod.GET)
	public ResponseEntity getCity(@RequestParam(value="id") Long id) {
		Optional<City> foundCitylist = cityRepository.findById(id);
		if(foundCitylist.isPresent()) {
			return ResponseEntity.ok(foundCitylist.get());
		}
		else {
			return ResponseEntity.badRequest().body("\"No state presents with specified id \" + id + \" found\"");
		}
	}

	// http://localhost:8081/api/city/id-> URL for getting all data from city
	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
	ResponseEntity<List<City>> listAllCity() {
		List<City> citys = cityRepository.findAll();
		if (citys.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<City>>(citys, HttpStatus.OK);
	}

	/*@RequestMapping(value = "/state/{id}", method = RequestMethod.GET)
	ResponseEntity<List<State>> listAllState() {
		List<State> states = stateRepository.findAll();
		if (states.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<State>>(states, HttpStatus.OK);
		// http:///localhost:8081/api/state/id-> URLS FOR GETTING ALL STATE DATA WITH ID
		
		 
		 */

	}

