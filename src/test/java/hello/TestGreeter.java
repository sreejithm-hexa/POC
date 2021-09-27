package hello;


@Library('shared-lib-unitTesting')_
import com.lesfurets.jenkins.unit.*;
import static groovy.test.GroovyAssert.*;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGreeter {
   private Greeter g;
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }


   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }

   @Test
   public void testGreeter() 
   {
      g.setName("World");
      assertEquals(g.getName(),"World");
      assertEquals(g.sayHello(),"Hello World!");
   }
   
   @Test
   public void newtestWMGreeterPass() {
       g.setName("Boris");
       assertEquals(g.getName(),"Boris");
       assertEquals(g.sayHello(),"Hello Boris!");
   }
   /*
   @Test
   public void newtestWMGreeterFail() {
       g.setName("Sandvich");
       assertEquals(g.getName(),"Boris");
       assertEquals(g.sayHello(),"Hello Boris!");
   }
   */
   
}
class SimpleUnitTest extends BasePipelineTest {
   def temp
   
   @Before
    void setUp() {
        super.setUp()
        // load temp
        temp = loadScript("vars/temp.groovy")

   @Test
    void Temperatureconverter() {
        // call temp and check result
        def result = temp(95)
        assertEquals(35, result)
    }
}
