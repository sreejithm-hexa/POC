library 'shared-lib-unitTesting'

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
        //temp= loadscript("library('my-shared-library').vars") 
        temp = loadScript('vars/temp.groovy') 
    }

   @Test
    void Temperatureconverter() {
        // call temp and check result
        def result = temp(98)
        assert 36.6666666667 == result
    }
}