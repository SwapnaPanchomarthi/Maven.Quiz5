package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

//        char[] s = string.toCharArray();
//        for (int len = 1; len <= string.length(); len++) {
//            // Pick ending point
//            for (int i = 0; i <= string.length() - len; i++) {
//                //  Print characters from current
//                // starting point to current ending
//                // point.
//                int j = i + len - 1;
//                for (int k = i; k <= j; k++) {
//                    System.out.print(s[k]);
//                }
//            }
//        }
//        String[] strArry = new String[s.length];
//        int i=0;
//        for (char d : s) {
//
//            strArry[i]=Character.toString(d);
//            i++;
//        }

        List<String> allSubStrings = new ArrayList<String>();
        int max = 1 << string.length();
        for (int index = 1; index < max; index++) {
            StringBuffer subString = new StringBuffer();
            int bits = index;
            int _index = 0;
            while (bits > 0) {
                if ((bits & 1) > 0) {
                    subString.append(string.charAt(_index));
                }
                bits >>= 1;
                _index++;
            }
            allSubStrings.add(subString.toString());
        }
        return allSubStrings.toArray(new String[string.length()]);

           // return strArry;
            }

    public static String[] getCommonSubstrings(String s, String t) {

        char[] c1 =s.toCharArray();
        char[] c2 = t.toCharArray();
        char[] c3= new char[c1.length];

        for(int i=0; i<s.length();i++) {
            for (int j = 0; j < t.length(); j++)
            {
                if(c1[i]==c2[j])
                {
                    c3[i]=c1[i];
                }
            }
        }

        String[] str = new String[c3.length];
             for(int k=0; k<c3.length; k++)
             {
                 str[k] = String.valueOf(c3[k]);
             }

        return str;
        //return null;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        StringBuilder sb = new StringBuilder();
        if (string1== null || string1.isEmpty() || string2 == null || string2.isEmpty())
            return "";

// ignore case
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

// java initializes them already with 0
        int[][] num = new int[string1.length()][string2.length()];
        int maxlen = 0;
        int lastSubsBegin = 0;

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    if ((i == 0) || (j == 0))
                        num[i][j] = 1;
                    else
                        num[i][j] = 1 + num[i - 1][j - 1];

                    if (num[i][j] > maxlen) {
                        maxlen = num[i][j];
                        // generate substring from str1 => i
                        int thisSubsBegin = i - num[i][j] + 1;
                        if (lastSubsBegin == thisSubsBegin) {
                            //if the current LCS is the same as the last time this block ran
                            sb.append(string1.charAt(i));
                        } else {
                            //this block resets the string builder if a different LCS is found
                            lastSubsBegin = thisSubsBegin;
                            sb = new StringBuilder();
                            sb.append(string1.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }}

        return sb.toString();
    }


}
