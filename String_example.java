package myproject;

public class String_example {
    public static void main(String[] args) {
        String str = "HELLO this IS JAVA CLASS";
        String str1 = "YO";
        String str2 = "KL";
        String str3 = "kL";
        String str4 = "1234";
        String str5 = "";
        String str6 = "     hello java     ";
        String str7 = "KL";
        
        System.out.println(str6.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str.charAt(7));
        System.out.println(str6.charAt(9));
        System.out.println(str2.compareTo(str1));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str2.concat(str1));
        System.out.println(str2.contains("KL"));
        System.out.println(str2.contentEquals(str7));
        System.out.println(str.endsWith("LASS"));
        System.out.println(str7.equals(str7));
        System.out.println(str7.indexOf('K'));
        System.out.println(str.lastIndexOf('A'));
        System.out.println(str4.matches("[a-zA-Z0-9]+"));
        System.out.println(str7.matches("\\d+"));
        System.out.println(str7.matches("[a-zA-Z0-9]+\\d+"));
        System.out.println(str7.isEmpty());
        System.out.println(String.join("|", str1, str2, str4));
        System.out.println(str7.replace('K', 'P'));
        System.out.println(str.replaceFirst("HELL", "FELL"));
        
        String str10 = "hi;how;are;you";
        String[] splitArray = str10.split(";");
        String[] st7 = str10.split(" ");
        
        for (String i : splitArray) {
            System.out.println(i);
        }
        
        System.out.println(str7.trim());
        System.out.println(String.valueOf(9.8f));
        System.out.println(str7.subSequence(0, 2));
    }
}
