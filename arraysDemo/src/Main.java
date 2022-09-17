public class Main {
    public static void main(String[] args) {

        String firstStudent = "Ahmet";
        String secondStudent = "Selim";
        String thirdStudent = "Selen";
        String fourthStudent = "Rohan";

        System.out.println(firstStudent);
        System.out.println(secondStudent);
        System.out.println(thirdStudent);
        System.out.println(fourthStudent);

        System.out.println("..::    *     *     *     ::..");

        String[] students = new String [4];
        students[0] = "Ahmet";
        students[1] = "Selim";
        students[2] = "Selen";
        students[3] = "Rohan";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println("..::    *     *     *     ::..");

        for (String student : students){
            System.out.println(student);
        }

    }
}