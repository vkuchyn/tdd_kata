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
        String[] numbersArray = numbers.split("[,|\n]");

        return calculateStringNumbers(numbersArray);
    }

    private int calculateStringNumbers(String... numbersArray)
    {
        int sum = 0;
        for (String number : numbersArray)
        {
            int intNumber = valueOf(number);
            sum += intNumber;
        }
        return sum;
    }


}
