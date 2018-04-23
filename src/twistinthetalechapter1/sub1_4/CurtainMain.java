package twistinthetalechapter1.sub1_4;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @topic 
 */
public class CurtainMain {
	
	public void testAccessModifierMethod() {
		Curtain1 curtain1 = new Curtain1();
		curtain1.displayCurtain1();
	}
	
	private class Curtain1 {
		void displayCurtain1() {
			
			System.out.println("Display Curtain 1");
			
//		CurtainMain curtainMain = new CurtainMain();
//		curtainMain.testAccessModifierMethod();
		
//		testAccessModifierMethod();
		}
	}
	
	protected class Curtain2 {
		void displayCurtain2() {
		}
	}
	
	class Curtain3 {
		void displayCurtain3() {
		}
	}
	
}
