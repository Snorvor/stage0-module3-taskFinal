package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        // (489 % 10) = 9
        // 9 * 100 = 900
        int revertedNumber = (number % 10) * 100;

        // (489 - 489 % 10) = 480
        // / 10 = 48
        number = (number - number % 10) / 10;

        // (number % 10) = 8
        // * 10 = 80;
        // revertedNumber + ... = 980
        revertedNumber = revertedNumber + (number % 10) * 10;

        // (48 - 48 % 10) = 40
        // / 10 = 4
        number = (number - number % 10) / 10;

        // 4 + 980 = 984
        revertedNumber = revertedNumber + number;

        System.out.println(revertedNumber);
    }
}
