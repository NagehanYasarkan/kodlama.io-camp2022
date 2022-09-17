public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("end of for loop #1");

        for(int i = 2; i <= 10; i += 2){
            System.out.println(i);
        }
        System.out.println("end of for loop #2");

        // While:

        int i = 1;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("end of while loop #1");


        i = 2;
        while (i < 10){
            System.out.println(i);
            i += 2;
        }
        System.out.println("end of while loop #2");

        // do while:
        int j = 1;
        do{
            System.out.println(j);
            j += 2;
        }while (j < 10);
        System.out.println("end of do-while loop #1");

        j = 100;
        do{
            System.out.println("Logged");
            System.out.println(j);
            j += 2;
        }while (j < 10);
        System.out.println("end of do-while loop #2");
    }
}