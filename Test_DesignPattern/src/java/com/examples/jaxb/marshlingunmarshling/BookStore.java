package com.examples.jaxb.marshlingunmarshling;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.examples.jaxb.marshlingunmarshling")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookStore {
	
	private String bookStoreName;
	private String bookStoreLocation;
	// XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "bookList")
    // XmlElement sets the name of the entities
    @XmlElement(name = "book")
	private List<Book> listOfBooks;
	/**
	 * @return the bookStoreName
	 */
	public String getBookStoreName() {
		return bookStoreName;
	}
	/**
	 * @param bookStoreName the bookStoreName to set
	 */
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	/**
	 * @return the bookStoreLocation
	 */
	public String getBookStoreLocation() {
		return bookStoreLocation;
	}
	/**
	 * @param bookStoreLocation the bookStoreLocation to set
	 */
	public void setBookStoreLocation(String bookStoreLocation) {
		this.bookStoreLocation = bookStoreLocation;
	}
	/**
	 * @return the listOfBooks
	 */
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}
	/**
	 * @param listOfBooks the listOfBooks to set
	 */
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	

}
