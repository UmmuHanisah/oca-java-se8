package building;

import library.Book;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @chapter 1.4.3 Protected access modifier
 */
public class StoryBook extends Book {
	
	public StoryBook() {
		
		author = "ABC";
		modifyTemplate();
		
		Book book = new Book();
		/*
		 * Note
		 * Protected members of class Book are not
		accessible in derived class StoryBook, if
		accessed using a new object of class Book.*/
		
		//String v = book.author; // it won't compile
		
		book.testAccessModifier();
		
		//  This will throw an error
		/*
		 * Note
		 * Derived class in different package cannot inherited the value from the base */
		
		//	int c = issueCount;
		//	issueHistory();
		
	}

}
