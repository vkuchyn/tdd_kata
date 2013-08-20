package ua.com.kuchyn.kata.calculator;

import static java.lang.Integer.valueOf;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 8/20/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator
{
    public int add(String numbers)
    {
        if (numbers.isEmpty())
        {
            return 0;
        }
        String [] numbersArray = numbers.split(",");

        if (numbersArray.length > 1){
            return calculateStringNumbers(numbersArray);
        }
        return valueOf(numbers);
    }

    private int calculateStringNumbers(String...numbersArray)
    {
        return valueOf(numbersArray[0]) + valueOf(numbersArray[1]);
    }


}
