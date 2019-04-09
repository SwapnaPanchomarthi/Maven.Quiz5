package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {


        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length()/2; j++) {
                if (isPalindrome(string.substring(i, j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }
        String[] array = new String[palindromes. size()];
        int i=0;
        for (String s: palindromes)
            array[i++] = s;
        System. out. println(Arrays. toString(array));

        return array;

//        char[] myArray = string.toCharArray();
//        int size = myArray.length;
//
//
//        char [] original = Arrays.copyOf(myArray,myArray.length);
//        for (int i = 0; i < size / 2; i++) {
//            char temp = myArray[i];
//            myArray[i] = (char) (myArray[i]+myArray[size-i-1]);
//            myArray[size-i-1] = temp;
//
//        }
//
//
//
//        System.out.println("Original Array"+Arrays.toString(original));
//
//        if(Arrays.equals(myArray, original)) {
//            System.out.println("Entered string is a palindrome");
//        } else {
//            System.out.println("Entered string is not a palindrome");
//        }
//        String[] strArry = new String[original.length];
//        int i=0;
//        for (char d : original) {
//
//            strArry[i]=Character.toString(d);
//            i++;
//        }
       // return new String[]{sb2.toString()};
    }

    public static Boolean isPalindrome(String string) {
        StringBuffer sb1 = new StringBuffer(string);
        StringBuffer sb2 = sb1.reverse();
        boolean flag = false;

        if(sb1.equals(sb2))
            flag=true;

        else flag=false;

        return flag;
    }

    public static String reverseString(String string) {
        StringBuffer sb1 = new StringBuffer(string);
        StringBuffer sb2 = sb1.reverse();

        return sb2.toString();
    }
}
