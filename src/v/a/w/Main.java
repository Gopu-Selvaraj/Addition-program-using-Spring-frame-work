package v.a.w;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		MyClass mo= (MyClass) ap.getBean("m");
		
		MyClass mo2=(MyClass) ap.getBean("n");
		mo.show(10,20);
		mo2.show2(10,20);

	}

}
