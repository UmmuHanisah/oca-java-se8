package main;

import com.oracle.javacert.Schedule;
import com.oracle.javacert.associate.ExamQuestion;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @chapter 1.3.6 The import statement doesn’t import the whole package tree / pg 49
 * 1.3.7 Importing classes from the default package / pg 50
 */
public class OcaMain {

	public static void main(String args[]) {
		Schedule schedule = new Schedule();

		/*
		 * 1.3.6 The import statement doesn’t import the whole package tree / pg 49
		 * 
		 * Note:
		 * ****
		 * You can’t import classes from a subpackage by using an asterisk in
		 * the import statement.	(Page 49)
		 */
		ExamQuestion examQuestion = new ExamQuestion();
		
		/*1.3.7 Importing classes from the default package*/
		
		/*Members of a named package can’t access classes and interfaces
		defined in the default package.*/
		// NoPackageClass 
		

	}
}
