public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManagerTwo = new CustomerManager();
        customerManager = customerManagerTwo;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

//        value
        int numberOne = 10;
        int numberTwo = 20;
        numberTwo = numberOne;
        numberOne = 30;
        System.out.println(numberTwo);

//        int[] numbersOne = {1,2,3};
        int[] numbersOne = new int[] {1,2,3};
        int[] numbersTwo = new int[] {4,5,6};
        numbersTwo = numbersOne;
        numbersOne[0] = 10;
        System.out.println(numbersTwo[0]);

    }
}

