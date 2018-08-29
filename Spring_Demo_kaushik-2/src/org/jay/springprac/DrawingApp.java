package org.jay.springprac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Traingle t = new Traingle();
		 BeanFactory factory = new XmlBeanFactory(new
		 FileSystemResource("spring.xml"));*/
	
		//Constructor Injection starts
		/*ApplicationContext contextconst = new ClassPathXmlApplicationContext("springConstructorInjection.xml");
		TraingleConstruction tc = (TraingleConstruction) contextconst.getBean("traingleConstructorId");
		tc.draw();*/
		//Constructor Injection ends
		
		
		// Injecting objects starts
		/*ApplicationContext context = new ClassPathXmlApplicationContext("springInjectingObjects.xml");
		TraingleInjectingObjects t = (TraingleInjectingObjects) context.getBean("traingleInjectObjectId");
		t.draw();*/
		// Injecting objects ends
		
		
		//Inner beans Start
		/*ApplicationContext contextconst = new ClassPathXmlApplicationContext("springInnerBeans_Alias_Idref.xml");
		TraingleInjectingObjects tib = (TraingleInjectingObjects) contextconst.getBean("traingleInnerBeanId");
		tib.draw();*/
		//with alias name
	/*	ApplicationContext contextconst = new ClassPathXmlApplicationContext("springInnerBeans_Alias_Idref.xml");
		  TraingleInjectingObjects tib1 = (TraingleInjectingObjects) contextconst.getBean("Alias-example-traingle");
		tib1.draw();*/
		//Inner Beans End
		
		//Collection start
		/*ApplicationContext contextcollection = new ClassPathXmlApplicationContext("springCollection.xml");
		TraingleCollection tricoll = (TraingleCollection) contextcollection.getBean("traingleCollectionId");
		tricoll.draw();*/
		//Collection end

		//Autowiring start
	/*	ApplicationContext contextautowire = new ClassPathXmlApplicationContext("springBeanAutowiring.xml");
		TraingleBeanAutowiring triautowiring = (TraingleBeanAutowiring) contextautowire.getBean("traingleBeanAutowiringId");
		triautowiring.draw();*/
		//Autowiring End
		
		//Bean Scope start
	/*	ApplicationContext contextbeanscope = new ClassPathXmlApplicationContext("springBeanScope.xml");
		TraingleBeanScope tribeanscope = (TraingleBeanScope) contextbeanscope.getBean("traingleBeanScopeId");
		tribeanscope.draw();*/
		//Bean Scope ends
		
		//ApplicationContextAware start check TraingleApplicationContextAware class for understanding
		ApplicationContext contextappaware = new ClassPathXmlApplicationContext("springApplicationContextAware.xml");
		TraingleApplicationContextAware triappaware = (TraingleApplicationContextAware) contextappaware.getBean("traingleApplicationContextAwareId");
		triappaware.draw();
		//ApplicationContextAware ends
		
		//BeanDefinition Inheritance start
		/*ApplicationContext contextBeanDefInheritance = new ClassPathXmlApplicationContext("springBeanDefinitionInheritance.xml");
		TraingleBeanDefinitionInheritance tribeanInher = (TraingleBeanDefinitionInheritance) contextBeanDefInheritance.getBean("traingleBeanDfnInheritenceId1");
	//	TraingleBeanDefinitionInheritance tribeanInher = (TraingleBeanDefinitionInheritance) contextBeanDefInheritance.getBean("traingleBeanDfnInheritenceId2");
		tribeanInher.draw();*/
		//BeanDefinition Inheritance ends
		
		//Life Cycle CallBack starts
	/*	AbstractApplicationContext contextlifeCycle = new ClassPathXmlApplicationContext("springLifeCycleCallback.xml");
		contextlifeCycle.registerShutdownHook();
		TraingleLifeCycleCallback trilifeCycle = (TraingleLifeCycleCallback) contextlifeCycle.getBean("traingleleLifeCycleCallbackId");
		trilifeCycle.draw();*/
		//Life Cycle CallBack Ends
		
		//BeanPostProcessor starts
	/*	ApplicationContext contextbeanPP = new ClassPathXmlApplicationContext("springBeanPostProcessor.xml");
		//contextbeanPP.registerShutdownHook();
		TraingleBeanPostProcessor tricontextbeanPP = (TraingleBeanPostProcessor) contextbeanPP.getBean("traingleBeanPostProcessorId");
		tricontextbeanPP.draw();*/
		//BeanPostProcessor end
		
		//BeanFactoryPostProcessor start
		/*AbstractApplicationContext contextBeanFactoryPP = new ClassPathXmlApplicationContext("springBeanFactoryPostProcessor.xml");
		contextBeanFactoryPP.registerShutdownHook();
		TraingleBeanFactoryPostProcessor tricontextBeanFactoryPP = (TraingleBeanFactoryPostProcessor) contextBeanFactoryPP.getBean("traingleBeanFactoryPostProcessorId");
		tricontextBeanFactoryPP.draw();*/
		//BeanFactoryPostProcessor end	
		
		//Coding to interface start
		/*ApplicationContext contextBeanFactoryPP = new ClassPathXmlApplicationContext("springInterface.xml");
		Shape shapeint = (Shape) contextBeanFactoryPP.getBean("TraingleInterfaceId");
		shapeint.draw();
		Shape shapeint1 = (Shape) contextBeanFactoryPP.getBean("CircleInterfaceId");
		shapeint1.draw();*/
		//Coding to interface end
		
		
	}

}
