package com.basics.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Soultions";
        System.out.println("Length:"+str.length());
        System.out.println("Char at index 2: "+str.charAt(2));
        System.out.println("Char at last index:" + str.charAt(str.length()-1));
        System.out.println("Uppercase:"+ str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Substring(0:9):"+ str.substring(0,9));
        System.out.println("Equalls(Tripillar Solutions):"+str.equals("Tripillar Soultions"));
        System.out.println("Equalls(Case doesnot matters):"+str.equalsIgnoreCase("tripillar soultions"));
        String jumbled = " Likith1Is1From1ECE1SecA";
        // "likit" , is , from, ece, secA
        String[]words = jumbled.split("1");
        System.out.println(words[0]);
        String name = "    likith A    ";
        System.out.println(name.trim()); // Remove spaces from starting & eending
        char[] letters = {'m','a','l','l','i','k','a','r','j','u','n'};
        //Mallikarjun
        //String word = letters.toString(); // Not correct and doesn't work
        String word = new String(letters);
        System.out.println(word);


    }
}
