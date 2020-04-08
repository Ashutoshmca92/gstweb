package com.ayasyaGst.regionalsettings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name="")
public class RegionalSettings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private String dateFormate;

	private String dateSeprator;

	private String currencySymbol;

	private String currencyString;

	private String currencySubString;

	private float currencyDesimalPlaces;

	private String currencyFont;

	private String currencyCharactor;

	private double formateDisplayingNumbrer;

	private String Country;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDateFormate() {
		return dateFormate;
	}

	public void setDateFormate(String dateFormate) {
		this.dateFormate = dateFormate;
	}

	public String getDateSeprator() {
		return dateSeprator;
	}

	public void setDateSeprator(String dateSeprator) {
		this.dateSeprator = dateSeprator;
	}

	public String getCurrencySymbol() {
		return currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencyString() {
		return currencyString;
	}

	public void setCurrencyString(String currencyString) {
		this.currencyString = currencyString;
	}

	public String getCurrencySubString() {
		return currencySubString;
	}

	public void setCurrencySubString(String currencySubString) {
		this.currencySubString = currencySubString;
	}

	public float getCurrencyDesimalPlaces() {
		return currencyDesimalPlaces;
	}

	public void setCurrencyDesimalPlaces(float currencyDesimalPlaces) {
		this.currencyDesimalPlaces = currencyDesimalPlaces;
	}

	public String getCurrencyFont() {
		return currencyFont;
	}

	public void setCurrencyFont(String currencyFont) {
		this.currencyFont = currencyFont;
	}

	public String getCurrencyCharactor() {
		return currencyCharactor;
	}

	public void setCurrencyCharactor(String currencyCharactor) {
		this.currencyCharactor = currencyCharactor;
	}

	public double getFormateDisplayingNumbrer() {
		return formateDisplayingNumbrer;
	}

	public void setFormateDisplayingNumbrer(double formateDisplayingNumbrer) {
		this.formateDisplayingNumbrer = formateDisplayingNumbrer;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String state;

	@Override
	public String toString() {
		return "RegionalSettings [id=" + id + ", dateFormate=" + dateFormate + ", dateSeprator=" + dateSeprator
				+ ", currencySymbol=" + currencySymbol + ", currencyString=" + currencyString + ", currencySubString="
				+ currencySubString + ", currencyDesimalPlaces=" + currencyDesimalPlaces + ", currencyFont="
				+ currencyFont + ", currencyCharactor=" + currencyCharactor + ", formateDisplayingNumbrer="
				+ formateDisplayingNumbrer + ", Country=" + Country + ", state=" + state + "]";
	}

}



