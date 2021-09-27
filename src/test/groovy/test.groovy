//@Library('shared-lib-unitTesting')_

import org.junit.Test
import org.junit.Before
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*
import static org.junit.Assert.assertEquals

class SimpleUnitTest extends BasePipelineTest {
   def temp
   
   @Before
    void setUp() {
        super.setUp()
        // load temp
        def t = library 'my-shared-library' 
        temp = t.vars.temp(98)
    }

   @Test
    void Temperatureconverter() {
        // call temp and check result
        //def result = temp(98)
        assert 36.6666666667 == temp
    }
}