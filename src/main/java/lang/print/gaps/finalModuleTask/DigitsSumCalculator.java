package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstNumber, secondNumber, thirdNumber, fourthNumber, sumOfEachValue;

        // to obtain fourth number
        fourthNumber = number % 10;

        // to eliminate fourth number of the original number
        number = number / 10;

        // to obtain third number
        thirdNumber = number % 10;

        // to eliminate third number of the original number
        number = number / 10;

        // to obtain second number
        secondNumber = number % 10;

        // to eliminate second number of the original number
        number = number / 10;

        // the first digit of var number is assigned to firstNumber
        firstNumber = number;

        sumOfEachValue = firstNumber + secondNumber + thirdNumber + fourthNumber;

        System.out.println(sumOfEachValue);
    }
}
