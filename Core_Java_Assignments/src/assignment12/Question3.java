package assignment12;

public class Question3 {
    public static void main(String[] args) {
        String name = "Lexiaal";
        String name1 = new String();
        for (int i = 0; i < name.length(); i++) {
            char charAtPosition = name.charAt(i);
            if (name1.indexOf(charAtPosition) < 0) {
                name1 += charAtPosition;
            }
        }
        System.out.println(name1);
    }
}
/*

 */