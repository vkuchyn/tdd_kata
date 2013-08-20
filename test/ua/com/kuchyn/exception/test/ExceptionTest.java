package ua.com.kuchyn.exception.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 8/20/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest
{
    @Test
    public void shouldTestExceptionWithTryCath(){
        //Given
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        try{
            //When
            exceptionGenerator.throwException();
            fail("Excpected RuntimeException");
        } catch (RuntimeException e){
            // ok
            //Expected
            assertThat(e.getMessage(), containsString("Error Message"));
        }
    }

    @Test(expected = RuntimeException.class)
    public void shouldTestExceptionWithExpectedParameter(){
        //Given
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        //Expected

        //When
        exceptionGenerator.throwException();
    }

    @Rule
    public ExpectedException ex = ExpectedException.none();

    @Test
    public void shouldTestExceptionWithRule(){
        //Given
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        //Expected
        ex.expectMessage("Error Message");
        ex.expect(RuntimeException.class);
        //When
        exceptionGenerator.throwException();
    }

    private class ExceptionGenerator
    {
        public void throwException()
        {
            throw new RuntimeException("Error Message");
        }
    }
}
