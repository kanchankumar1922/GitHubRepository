/**
 * 
 */
package com.kanchan.hibernate.topics.eagerlazyintialization;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author kumark
 *
 */

@Embeddable
@Table (name = "ADDRESS_EAGER_LAZY")
public class AddressEagerLazy {
	
	@Column (name = "CITY")
	private String city;
	@Column (name = "STATE")
	private String state;
	@Column (name = "STREET")
	private String street;
	@Column (name = "HOUSE_NO")
	private String houseNo;
	@Column (name = "COUNTRY")
	private String country;
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}
	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	

}
