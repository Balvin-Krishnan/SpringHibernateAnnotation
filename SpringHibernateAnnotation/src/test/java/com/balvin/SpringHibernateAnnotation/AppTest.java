package com.balvin.SpringHibernateAnnotation;

import java.sql.Timestamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.balvin.entity.Actor;
import com.balvin.service.ActorService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocation.xml");
		
		ActorService actorService = (ActorService)context.getBean("actorService");
		
		//Find Actor
		Actor actor = actorService.findActorByActorId(2);
		System.out.println(actor.getFirstName());
		
		//Save Actor
		Actor actor2 = new Actor();
		actor2.setActorId(98764);
		actor2.setFirstName("fName");
		actor2.setLastName("lName");
		actor2.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		actorService.saveActor(actor);
		
		
		//Actor actor3 = actorService.findActorByActorId(1234);
		//System.out.println(actor3.getFirstName());
	}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
