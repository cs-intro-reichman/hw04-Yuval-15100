public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        StringBuilder newString = new StringBuilder(str);
        
        for (int i = 0; i < newString.length(); i++) {
            if (64 < newString.charAt(i) && newString.charAt(i) < 91) {
                newString.setCharAt(i, (char) (newString.charAt(i) + 32));; }
        }
       
        return newString.toString();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(0) == str1.charAt(i)) {
                boolean match = true; 
              
            for (int j =1; j < str2.length(); j++) {
                if (str2.charAt(j) != str1.charAt(i + j)) {
                match = false;
                break; }
               }

        if (match) {
            return true; }
            }
        }
            
        return false;
    }
}
