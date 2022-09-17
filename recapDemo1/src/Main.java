public class Main {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 25;
        int thirdNumber = 2;

        int max = secondNumber;

        if (firstNumber > secondNumber){
            max = firstNumber;
        }
        if (thirdNumber > secondNumber){
            max = thirdNumber;
        }
        System.out.println(max);
    }
}