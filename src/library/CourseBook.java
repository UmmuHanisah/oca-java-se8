package library;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @chapter 1.4.3 Protected access modifier
 */
public class CourseBook extends Book {
	
	public CourseBook() {
		author = "ABC";
		modifyTemplate();
		
		int c = issueCount;
		issueHistory();
		
		Book book = new Book();
		book.author = "Ummu";
		book.modifyTemplate();
	}
}
