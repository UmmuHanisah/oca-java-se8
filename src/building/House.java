package building;

import library.Book;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @chapter 1.4.3 Protected access modifier
 */
public class House {
	
	public House() {
		Book book = new Book();
		 /*Note: Will throw an error at line 18
		 We can't access protected member that coming from different package*/ 
		//	book.author="ABC";
		//	book.modifyTemplate();
	}

}
