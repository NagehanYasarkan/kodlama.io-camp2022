public class Main {
    public static void main (String[] args) {
        findingANumber();
        findingANumber();
        findingANumber();
    }
    public static void findingANumber() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int sought = 6;
        boolean isSought = false;

        for (int number : numbers) {
            if (number == sought) {
                isSought = true;
                break;
            }
        }

        if (isSought) {
            getMessage("Number found" + sought);
        } else {
            getMessage("Number cannot be found " + sought);
        }
    }
    public static void getMessage(String message){
        System.out.println(message);

    }


}
