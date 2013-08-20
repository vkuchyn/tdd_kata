package ua.com.kuchyn.kata.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 8/20/13
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest
{
    @Test
    public void shouldReturnZeroWhenEmptyString(){
        //Given
        StringCalculator stringCalculator = new StringCalculator();
        //When
        int actual = stringCalculator.add("");
        //Then
        assertThat(actual, is(0));
    }
}
