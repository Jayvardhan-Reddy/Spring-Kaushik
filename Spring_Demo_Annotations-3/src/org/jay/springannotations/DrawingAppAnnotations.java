package org.jay.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Required annotation start
		/*ApplicationContext contextannotation = new ClassPathXmlApplicationContext("springAnnotations.xml");
		//ShapeAnnotations shapeann = (ShapeAnnotations)contextannotation.getBean("TraingleAnnotationsId"); 
		ShapeAnnotations shapeann = (ShapeAnnotations)contextannotation.getBean("CircleAnnotationsId");
		shapeann.draw();*/
		//Required annotation end
		
		//Autowired annotation start
			/*ApplicationContext contextannotation = new ClassPathXmlApplicationContext("springAutowire.xml");
			//ShapeAnnotations shapeann = (ShapeAnnotations)contextannotation.getBean("TraingleAnnotationsId"); 
			ShapeAnnotations shapeann = (ShapeAnnotations)contextannotation.getBean("CircleAutowiredId");
			shapeann.draw();*/
			//Autowired annotation end
				
			//JSR250 annotation start
		/*	AbstractApplicationContext contextannotation = new ClassPathXmlApplicationContext("springJSR250Annotation.xml");
			contextannotation.registerShutdownHook();
			ShapeAnnotations shapeann = (ShapeAnnotations)contextannotation.getBean("CircleJSR250AnnotaionId");
			shapeann.draw();*/
			//JSR250 annotation end
			
			//Componenet annotation start
		/*	AbstractApplicationContext contextconfig = new ClassPathXmlApplicationContext("springComponent.xml");
			contextconfig.registerShutdownHook();
			ShapeAnnotations shapeann = (ShapeAnnotations)contextconfig.getBean("circleComponent");
			shapeann.draw();*/
			//Componenet annotation end
			
			//messageSource Begin
			/*ApplicationContext contextMsgSource = new ClassPathXmlApplicationContext("springMessageSource.xml");
			ShapeAnnotations shapeann = (ShapeAnnotations)contextMsgSource.getBean("CircleMessageSourceId");
			shapeann.draw();
			System.out.println(contextMsgSource.getMessage("greeting", null,"default message",null));*/
			//messageSource Ends
		
		//Event begin
		AbstractApplicationContext contextEvent = new ClassPathXmlApplicationContext("springEvent.xml");
		contextEvent.registerShutdownHook();
		ShapeAnnotations shapeann = (ShapeAnnotations)contextEvent.getBean("circleEvent");
		shapeann.draw();
		//Event Ends
	}

}
