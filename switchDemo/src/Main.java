public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Perfect! You've passed the course");
                break;
            case 'B':
                System.out.println("Good Job! You've passed the course");
                break;
            case 'C':
                System.out.println("Good! You've passed the course");
                break;
            case 'D':
                System.out.println("Conditional pass");
                break;
            case 'F':
                System.out.println("You failed the course");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}