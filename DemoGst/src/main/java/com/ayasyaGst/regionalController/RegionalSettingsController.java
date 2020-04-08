package com.ayasyaGst.regionalController;

import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyaGst.regionalRepository.RegionalSettingsRepository;
import com.ayasyaGst.regionalsettings.RegionalSettings;

@RestController
@RequestMapping("/api")
public class RegionalSettingsController {

	@Autowired
	RegionalSettingsRepository regionalSettingsRepository;

	@RequestMapping(value = "/regional", method = RequestMethod.POST)

	public ResponseEntity<?> cretaeNewRegionalSettings(@RequestBody @Valid RegionalSettings rgSettings) {

		RegionalSettings settings = new RegionalSettings();
		settings.setId(rgSettings.getId());
		settings.setDateFormate(rgSettings.getDateFormate());
		settings.setDateSeprator(rgSettings.getDateSeprator());
		settings.setCurrencySymbol(rgSettings.getCurrencySymbol());
		settings.setCurrencyString(rgSettings.getCurrencyString());
		settings.setCurrencySubString(rgSettings.getCurrencySubString());
		settings.setCurrencyDesimalPlaces(rgSettings.getCurrencyDesimalPlaces());
		settings.setCurrencyFont(rgSettings.getCurrencyFont());
		settings.setCurrencyCharactor(rgSettings.getCurrencyCharactor());
		settings.setFormateDisplayingNumbrer(rgSettings.getFormateDisplayingNumbrer());
		settings.setCountry(rgSettings.getCountry());
		regionalSettingsRepository.save(settings);

		return new ResponseEntity<String>("sucsess", HttpStatus.OK);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)

	public List<RegionalSettings> getAllSettings() {
		return regionalSettingsRepository.findAll();
	}

}
