package miscellaneous;

public class SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {
        int firstNumber = 30;
        int secondNumber = 50;

        swap(firstNumber,secondNumber);

    }

    private static void swap(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber -secondNumber;

        System.out.println("First Number : "+ firstNumber);
        System.out.println("Second Number :" + secondNumber);



    }
}
