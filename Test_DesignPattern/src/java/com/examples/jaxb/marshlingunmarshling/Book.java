package com.examples.jaxb.marshlingunmarshling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "Book")
@XmlType(propOrder = { "bookID", "author", "bookName", "bookPrice" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {

	@XmlElement (defaultValue = "default Book ID")
	private int bookID;
	@XmlElement (defaultValue = "Unknown Author")
	private String author;
	@XmlElement (defaultValue = "Unknown Name")
	private String bookName;
	@XmlElement (defaultValue = "Not available")
	private float  bookPrice;
	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the bookPrice
	 */
	public float getBookPrice() {
		return bookPrice;
	}
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	

}
