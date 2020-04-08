package com.ayasyaGst.webcontroller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyaGst.generalData.GeneralData;
import com.ayasyaGst.generaldataRepository.GeneralDataRepository;

@RestController
@RequestMapping(value = "api")
public class GeneraldataController {

	public static final Logger logger = LoggerFactory.getLogger(GeneraldataController.class);
	@Autowired
	GeneralDataRepository generalDataRepository;

	// Get all general data information.
	@RequestMapping(value = "/generalData", method = RequestMethod.GET)
	public List<GeneralData> getAllgeneralData() {
		return generalDataRepository.findAll();
	}

	// new resource created through post method api- post
	@RequestMapping(value = "/newGeneralDataform", method = RequestMethod.POST)
	ResponseEntity<String> createNewGeneralData(@RequestBody @Valid GeneralData generaldata) {

		GeneralData general = new GeneralData();
		general.setId(generaldata.getId());
		general.setMdc(generaldata.getMdc());
		general.setDefcc(generaldata.getDefcc());
		general.setBinddata(generaldata.getBinddata());
		general.setEnableVocherAuditing(generaldata.getEnableVocherAuditing());
		general.setDisplayThought(generaldata.getDisplayThought());
		general.setMaintainSignatureUser(generaldata.getMaintainSignatureUser());
		general.setMaintainTrackingVoucher(generaldata.getMaintainTrackingVoucher());
		general.setIntelligentSearch(generaldata.getIntelligentSearch());
		general.setMastersDrop(generaldata.getMastersDrop());
		general.setChangeVoucherType(generaldata.getChangeVoucherType());
		general.setModeSendingSMS(generaldata.getModeSendingSMS());
		general.setDuplicateSalesInvoice(generaldata.getDuplicateSalesInvoice());
		general.setSecondLanguageSupport(generaldata.getSecondLanguageSupport());

		generalDataRepository.save(general);

		return new ResponseEntity<String>("Success", HttpStatus.OK);

	}

	// Get general data details through id - GET METHODD{ID}
	@RequestMapping(value = "/genData/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getGeneralData(@PathVariable("id") long id) {
		logger.info("Fetching general data id {} ", id);

		Optional<GeneralData> general = generalDataRepository.findById(id);
		if (general == null) {
			logger.error("GeneralData with id {} not found.", id);

			return new ResponseEntity("suceess ?", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("success", HttpStatus.OK);

	}

	//

}
