package com.cssl.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cssl.print.Printer;
import com.cssl.spring.Greeting;
import com.cssl.spring.HelloSpring;

class JTest {

	@Test
	void test() {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs=(HelloSpring) context.getBean("helloSpring");
		hs.print();
	}
	
	@Test
	void test1() {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Greeting zhangGa= (Greeting) context.getBean("zhangGa");
		zhangGa.sayGreeting();
		Greeting rod=(Greeting) context.getBean("rod");
		rod.sayGreeting();
	}
	
	@Test
	void test2() {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer=  (Printer) context.getBean("printer");
		String content="几位轻量级容器的作者曾骄傲地对我说：这些容器非常有"+
				"用，因为他们实现了“控制反转”。这样的说辞让我深感迷惑：控"+
				"制反转还框架所共有的特征，如果仅仅因为使用了控制反转就认为"+
				"这些轻量级容器与众不同，就好像在说“我的轿车是与众不同的，"+
				"因为它有4个轮子。”";
		printer.print(content);
	}

}
