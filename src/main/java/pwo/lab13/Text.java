package pwo.lab13;

public class Text {

    static boolean cont5Dig(String str){
        return str.replaceAll("[^0-9]", "").length()==5;
    }
    
    static int numberOfDigits(String str) {
        return str.replaceAll("[^0-9]", "").length();
    }
    
    static boolean notContainsDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == 0;
    }
    
    static boolean containsOnlyDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}