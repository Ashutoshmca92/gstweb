package com.ayasyaGst.generalData;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="General")
public class GeneralData {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	//maintain data checklist
	private String mdc;
	
	//Enable notes manager
	private String enm;
	
	//delete export files on closing the company
	private String []defcc;
	
	//Bind Data with specified HDD(s) 
	private String binddata;
	
	//Enable Voucher Auditing
	private String enableVocherAuditing;
	
	//Display Thought of  the day
	private String displayThought;
	
	//Maintain image & Signature with User
	private String  maintainSignatureUser;
	
	//Maintain Tracking no. in voucher
	private String maintainTrackingVoucher;
	
	//Intelligent Search in master's Drop Down List
	private String []intelligentSearch;
	
	//show < -- End of List--> i master's drop down
	private String mastersDrop;
	
	//Change Voucher Type Captions(S)
	private String changeVoucherType;
	
	//Default Mode of Sending SMS
	private String modeSendingSMS;
	
	//print duplicate copy while re-printing sales invoice
	private String duplicateSalesInvoice;
	
	//Enable second language support
	private String secondLanguageSupport;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMdc() {
		return mdc;
	}

	public void setMdc(String mdc) {
		this.mdc = mdc;
	}

	public String getEnm() {
		return enm;
	}

	public void setEnm(String enm) {
		this.enm = enm;
	}

	public String[] getDefcc() {
		return defcc;
	}

	public void setDefcc(String[] defcc) {
		this.defcc = defcc;
	}

	public String getBinddata() {
		return binddata;
	}

	public void setBinddata(String binddata) {
		this.binddata = binddata;
	}

	public String getEnableVocherAuditing() {
		return enableVocherAuditing;
	}

	public void setEnableVocherAuditing(String enableVocherAuditing) {
		this.enableVocherAuditing = enableVocherAuditing;
	}

	public String getDisplayThought() {
		return displayThought;
	}

	public void setDisplayThought(String displayThought) {
		this.displayThought = displayThought;
	}

	public String getMaintainSignatureUser() {
		return maintainSignatureUser;
	}

	public void setMaintainSignatureUser(String maintainSignatureUser) {
		this.maintainSignatureUser = maintainSignatureUser;
	}

	public String getMaintainTrackingVoucher() {
		return maintainTrackingVoucher;
	}

	public void setMaintainTrackingVoucher(String maintainTrackingVoucher) {
		this.maintainTrackingVoucher = maintainTrackingVoucher;
	}

	public String[] getIntelligentSearch() {
		return intelligentSearch;
	}

	public void setIntelligentSearch(String[] intelligentSearch) {
		this.intelligentSearch = intelligentSearch;
	}

	public String getMastersDrop() {
		return mastersDrop;
	}

	public void setMastersDrop(String mastersDrop) {
		this.mastersDrop = mastersDrop;
	}

	public String getChangeVoucherType() {
		return changeVoucherType;
	}

	public void setChangeVoucherType(String changeVoucherType) {
		this.changeVoucherType = changeVoucherType;
	}

	public String getModeSendingSMS() {
		return modeSendingSMS;
	}

	public void setModeSendingSMS(String modeSendingSMS) {
		this.modeSendingSMS = modeSendingSMS;
	}

	public String getDuplicateSalesInvoice() {
		return duplicateSalesInvoice;
	}

	public void setDuplicateSalesInvoice(String duplicateSalesInvoice) {
		this.duplicateSalesInvoice = duplicateSalesInvoice;
	}

	public String getSecondLanguageSupport() {
		return secondLanguageSupport;
	}

	public void setSecondLanguageSupport(String secondLanguageSupport) {
		this.secondLanguageSupport = secondLanguageSupport;
	}

	@Override
	public String toString() {
		return "GeneralData [id=" + id + ", mdc=" + mdc + ", enm=" + enm + ", defcc=" + Arrays.toString(defcc)
				+ ", binddata=" + binddata + ", enableVocherAuditing=" + enableVocherAuditing + ", displayThought="
				+ displayThought + ", maintainSignatureUser=" + maintainSignatureUser + ", maintainTrackingVoucher="
				+ maintainTrackingVoucher + ", intelligentSearch=" + Arrays.toString(intelligentSearch)
				+ ", mastersDrop=" + mastersDrop + ", changeVoucherType=" + changeVoucherType + ", modeSendingSMS="
				+ modeSendingSMS + ", duplicateSalesInvoice=" + duplicateSalesInvoice + ", secondLanguageSupport="
				+ secondLanguageSupport + "]";
	}
	
	
	
	

}

	
