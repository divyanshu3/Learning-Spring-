package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowired.Employee;
import com.springcore.constructorInjection.Person;
import com.springcore.javaconfig.Javaconfig;
import com.springcore.lifecycle.Samosa;
import com.springcore.ref.A;
import com.springcore.spel.Demo;
import com.springcore.javaconfig.*;
import com.springcore.standalone.collections.*;
import com.springcore.sterotype.annotation.Sports;
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
        
       /* AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
       
        Samosa s1= (Samosa) context.getBean("samosa");
        
        System.out.println(s1);
        
        context.registerShutdownHook();*/ // registering shutdown hook -- calls destroy method
        
        
        // AutoWired annotation
        
       /* ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowired/autoconfig.xml");
        
        Employee e1 = (Employee) context.getBean("employee");
        System.out.println(e1); */
        
        // Standalone collections
        
       /* ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
        
        com.springcore.standalone.collections.Person p1 = (com.springcore.standalone.collections.Person) context.getBean("person1");
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1);*/
        
        
        // Sterotype annotation: object declaration using @Component
        
       /* ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/annotation/steroconfig.xml");
        
        Sports s1 = (Sports) context.getBean("sports");
        System.out.println(s1);
        System.out.println(s1.getTeams());*/
        
        
        // spring expression language
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
        
        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);*/
        
        // configuations using annotation and java
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
        com.springcore.javaconfig.Demo d = context.getBean("demo", com.springcore.javaconfig.Demo.class);
        d.test();
    }
}
