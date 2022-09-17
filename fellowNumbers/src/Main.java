public class Main {
    public static void main(String[] args) {

        int numberOne = 222;
        int numberTwo = 284;
        int sum = 0;
        int total = 0;

        for (int i = 1; i < numberOne; i++){
            if (numberOne % i == 0){
                sum = sum + i;
            }
        }
        for (int i = 1; i < numberTwo; i++){
            if(numberTwo % i == 0){
                total = total + i;
            }
        }

        if ((numberOne == total) && (numberTwo == sum)){
            System.out.println("these numbers are fellows");
        }else{
            System.out.println("these numbers are strangers");
        }


    }
}