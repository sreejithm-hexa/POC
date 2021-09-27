//@Library('shared-lib-unitTesting')_

import org.junit.Test
import org.junit.Before
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*
import static org.junit.Assert.assertEquals

class SimpleUnitTest extends BasePipelineTest {
   def t
   
   @Before
    void setUp() {
        super.setUp()
        // load temp
        def t = library 'shared-lib-unitTesting'.t.vars.temp(98)
        //temp = t.vars.temp(98)

    }

   @Test
    void Temperatureconverter() {
        // call temp and check result
        //def result = temp(98)
        assert 36.6666666667 == t
    }
}