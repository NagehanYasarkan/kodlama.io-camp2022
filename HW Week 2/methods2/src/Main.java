public class Main {
    public static void main(String[] args) {
        String message = "Today the weather is so nice";
        String newMessage = getCity();
        System.out.println(newMessage);
        int number = addition(5,7);
        System.out.println(number);
        int sum = additionTwo(2,3,4,5,6);
        System.out.println(sum);

    }
    public static void add(){
        System.out.println("Added");
    }
    public static void delete(){
        System.out.println("Deleted");
    }
    public static void update(){
        System.out.println("Updated");

    }
    public static int addition(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    public static int additionTwo(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
    public static String getCity(){
        return "Ankara";
    }

}