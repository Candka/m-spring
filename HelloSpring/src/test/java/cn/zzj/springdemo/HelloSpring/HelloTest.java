package cn.zzj.springdemo.HelloSpring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloTest {
	@Test
	public void Test1(){
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		//获取容器中的User
		User user = (User) ac.getBean("user");
		//输出结果
		System.out.println("Hello"+user);
	}

}
