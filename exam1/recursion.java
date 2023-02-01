public class App {
    public static void main(String[] args) throws Exception {
        
        String fullName = "ben christian aceveda";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
        if (str.length() == 0 ) {
            return;
        } if (str.charAt(0) == 'a') {
            removeLetter(str.substring(1));
        } else if (str.charAt(0) == 'e') {
            removeLetter(str.substring(1));
        } else if (str.charAt(0) == 'i') {
            removeLetter(str.substring(1));
        } else if (str.charAt(0) == 'o') {
            removeLetter(str.substring(1));
        } else if (str.charAt(0) == 'u') {
            removeLetter(str.substring(1));
        } else {
            System.out.print(str.charAt(0));
            removeLetter(str.substring(1));
        }
    }

}
