package com.examples.jaxb.marshlingunmarshling;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setBookID(1001);
		book1.setBookName("Organic Chemistry");
		book1.setBookPrice(2000.00f);
		book1.setAuthor("P N Narayan");
		
		Book book2 = new Book();
		book2.setBookID(1002);
		book2.setBookName("Physics");
		book2.setBookPrice(2000.00f);
		book2.setAuthor("R K Bhat");
		
		Book book3 = new Book();
		book3.setBookID(1003);
		book3.setBookName("Biology");
		book3.setBookPrice(2000.00f);
		book3.setAuthor("Sunil Prasad");
		
		Book book4 = new Book();
		book4.setBookID(1004);
		book4.setBookName("Mathematics");
		book4.setBookPrice(2000.00f);
		book4.setAuthor("R K Tiwary");
		
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		
		BookStore bookStore = new BookStore();
		bookStore.setBookStoreLocation("Peachtree city");
		bookStore.setBookStoreName("Hindu Libraray");
		bookStore.setListOfBooks(listOfBooks);
		
		JAXBContext context = null;
		Marshaller marshaller = null;
		try {
			 context = JAXBContext.newInstance(BookStore.class);
			 
			 if(null != context)
			 marshaller = context.createMarshaller();
		     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		     
		     if(null != marshaller)
		 		marshaller.marshal(bookStore, System.out);
		     
		} catch (JAXBException e) {
			System.out.println("Exception happened whne marshlilling the object via JAXB Context");
			e.printStackTrace();
		}

		
	}

}
