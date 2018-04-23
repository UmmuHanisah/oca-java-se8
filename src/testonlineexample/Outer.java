package testonlineexample;

import javax.swing.JPanel;

/**
 * @author Ummu Hanisah
 * @date Apr 11, 2018
 * 
 * @project oca-java-se8
 * @topic 
 */
public class Outer{
    private class Inner extends JPanel{
        public void doSomeWork(){}
    }

    public Outer(){
        Inner inner = new Inner();
        inner.doSomeWork();
    }

    public static void main(String args[]){
        Outer outer = new Outer();
    }
}
