package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    private String str;

    public StringEvaluatorObject(String str) {
        this.str=str;
    }

    public String[] getAllSubstrings() {
        List<String> allSubStrings = new ArrayList<String>();
        int max = 1 << str.length();
        for (int index = 1; index < max; index++) {
            StringBuffer subString = new StringBuffer();
            int bits = index;
            int _index = 0;
            while (bits > 0) {
                if ((bits & 1) > 0) {
                    subString.append(str.charAt(_index));
                }
                bits >>= 1;
                _index++;
            }
            allSubStrings.add(subString.toString());
        }
        return allSubStrings.toArray(new String[str.length()]);

    }

    public String[] getCommonSubstrings(String secondInput) {
        return null;
    }

    public String getLargestCommonSubstring(String secondInput) {
        StringBuilder sb = new StringBuilder();
        if (str== null || str.isEmpty() || secondInput == null || secondInput.isEmpty())
            return "";

// ignore case
        str = str.toLowerCase();
        secondInput = secondInput.toLowerCase();

// java initializes them already with 0
        int[][] num = new int[str.length()][secondInput.length()];
        int maxlen = 0;
        int lastSubsBegin = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < secondInput.length(); j++) {
                if (str.charAt(i) == secondInput.charAt(j)) {
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
                            sb.append(str.charAt(i));
                        } else {
                            //this block resets the string builder if a different LCS is found
                            lastSubsBegin = thisSubsBegin;
                            sb = new StringBuilder();
                            sb.append(str.substring(lastSubsBegin, i + 1));
                        }
                    }
                }
            }}

        return sb.toString();
    }
}
