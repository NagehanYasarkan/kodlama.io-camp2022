public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 5, 7, 9 ,0};
        int sought = 9;
        boolean isFound = false;


        for(int number : numbers) {
            if (number == sought) {
                isFound = true;
                break;
            }
        }

        if (isFound){
            System.out.println("number is found");
        }else {
            System.out.println("number cannot be found");
        }
    }
}