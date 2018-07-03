package com.infotech.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.infotech.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Object object = beanFactory.getBean("message");
		if(object != null) {
			Message message = (Message)object;
			System.out.println(message.getMessageId() + "\t" + message.getMessage());
		}
		

	}

}
