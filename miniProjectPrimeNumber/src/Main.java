public class Main {
    public static void main(String[] args) {

        int number = 17;


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                break;
            }else{
                System.out.println(number + " is a prime number");
                break;
            }

        }

    }
}