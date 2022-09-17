import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String text = "Weather is awesome today.";

        System.out.println(text);
//
//        System.out.println("Character number = " + text.length());
//        System.out.println("5th character = " + text.charAt(4));
//        System.out.println(text.concat(" Hallelujah"));
//        System.out.println(text.startsWith("E"));
//        System.out.println(text.endsWith("."));
//        char[] characters = new char[5];
//        text.getChars(0, 5,characters,0);
//        System.out.println(characters);
//        System.out.println(text.indexOf('a'));
//        System.out.println(text.lastIndexOf('a'));

        String newText = text.replace(' ', '-');
        System.out.println(newText);
//        System.out.println(text.replace(' ', '-'));

        System.out.println(text.substring(2, 4));

        for(String word : text.split(" ")){
            System.out.println(word);
        }

        System.out.println(" ");
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.trim());
    }
}