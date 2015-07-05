package com.kanchan.hibernate.topics.eagerlazyintialization;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "eagerlazyintialization.Person")
@Table (name = "PERSON_EAGER_LAZY")
public class PersonEagerLazy {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(name = "SOMETHING_SEQ")
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "SOMETHING_SEQ")	                
	@Column (name  = "PERSON_ID")
    private int id;
	@Column (name  = "PERSON_FNAME")
    private String fName;
	@Column (name  = "PERSON_LNAME")
    private String lName;
	@Column (name  = "GENDER")
    private String gender;
	@Column (name  = "AGE")
    private int age;

	@ElementCollection(fetch = FetchType.EAGER)
	@GenericGenerator(name = "hilo-gen", strategy = "" )
	/*@OneToMany(cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)*/
	@JoinTable(name = "ADDRESS", joinColumns = {
			      @JoinColumn(name = "PERSON_ID")
			 })
	@Column (name = "ADDRESS_ID")
	//@CollectionId( generator = "hilo-gen", columns = { @Column(name = "ADDRESS_ID") }, type = @Type (type))
	private List<AddressEagerLazy> setOfAddresses = new ArrayList<AddressEagerLazy>();
	

    /**
	 * @return the setOfAddresses
	 */
	public List<AddressEagerLazy> getSetOfAddresses() {
		return setOfAddresses;
	}

	/**
	 * @param setOfAddresses the setOfAddresses to set
	 */
	public void setSetOfAddresses(List<AddressEagerLazy> setOfAddresses) {
		this.setOfAddresses = setOfAddresses;
	}

	public PersonEagerLazy() {
        System.out.println("person constructor called");
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getfName() {
        return fName;
    }

    public String getGender() {
        return gender;
    }

    public String getlName() {
        return lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

}
