package library;


/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @chapter 1.4.3 Protected access modifier
 */
public class Librarian {
	
	// Note: Class Librarian is within the same package, 
	// hence we can instantiate an object.
	public Librarian() {
		Book book = new Book();
		book.author = "ABC";
		book.modifyTemplate();
		
		Book b = new Book();
		int c = b.issueCount;
		b.issueHistory();
		
		//Curtain curtain = new Curtain();
		//curtain.na
		
	}
}
