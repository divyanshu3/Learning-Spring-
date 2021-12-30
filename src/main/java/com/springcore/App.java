package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorInjection.Person;
import com.springcore.lifecycle.Samosa;
import com.springcore.ref.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // for getting object of beans
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student1 = (Student) context.getBean("student1");
//        Student student2 = (Student) context.getBean("student2");
//        System.out.println(student1);
//        System.out.println(student2);
        
        // injecting reference type
       /* 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        
        A a = (A) context.getBean("Aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
        System.out.println(a); */
        
        // constructor injection
        
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorconfig.xml");
        
        Person person = (Person) context.getBean("person1");
        System.out.println(person);*/
        
        
        // life cycle method of spring bean
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
       
        Samosa s1= (Samosa) context.getBean("samosa");
        
        System.out.println(s1);
        
        context.registerShutdownHook(); // registering shutdown hook -- calls destroy method
    }
}
