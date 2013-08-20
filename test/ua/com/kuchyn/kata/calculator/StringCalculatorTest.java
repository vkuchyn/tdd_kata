package ua.com.kuchyn.kata.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
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
    public void shouldReturnZeroWhenEmptyString()
    {
        //Given
        StringCalculator stringCalculator = new StringCalculator();
        //When
        int actual = stringCalculator.add("");
        //Then
        assertThat(actual, is(0));
    }

    @Test
    public void shouldReturnSingleNumber()
    {
        //Given
        StringCalculator stringCalculator = new StringCalculator();
        //When
        int actual = stringCalculator.add("23");
        //Then
        assertThat(actual, is(23));
    }

    @Test
    public void shouldReturnSumWhenTwoNumbers()
    {
        //Given
        StringCalculator stringCalculator = new StringCalculator();
        //When
        int actual = stringCalculator.add("2,3");
        //Then
        assertThat(actual, is(5));
    }

    @Test
    public void shouldReturnSumWhenLotsOfNumbers()
    {
        //Given
        StringCalculator stringCalculator = new StringCalculator();
        //When
        int actual = stringCalculator.add("2,3,4,5,2,3");
        //Then
        assertThat(actual, is(19));
    }
}
