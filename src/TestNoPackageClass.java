import com.oracle.javacert.Schedule;


/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @topic 1.3.7 Importing classes from the default package
 */
public class TestNoPackageClass {
	
	NoPackageClass noPackageClass;

	// Testing class in default package accessing class in a named package
	Schedule schedule = new Schedule();
}
