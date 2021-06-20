package Study_Practice;

import java.util.Locale;

public class StringMethod_ga {

    public static void main(String[] args) {

        System.out.println("Alia Mughal");
        System.out.println("Alia \nMughal");
        System.out.println("Alia \"Mughal\"");
        System.out.println("Alia \\ Mughal");
        System.out.println("Alia Mughal "
                            +"is learning Java "
                            +"she is gradually getting better at it, "
                            +"and she's really proud of herself.");

        String phrase = "Safia Sultana";

        System.out.println(phrase);
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.length());
        System.out.println(phrase.contains("Sultana"));


    }
}
