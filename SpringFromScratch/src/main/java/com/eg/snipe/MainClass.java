package com.eg.snipe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
public static void main(String[] args) {
			Resource r= new ClassPathResource("Mybeans.xml");
			BeanFactory factory = new XmlBeanFactory(r);
			SamplePojo sample = (SamplePojo) factory.getBean("mail");
			sample.sending();
			sample.receiving();
}
}
