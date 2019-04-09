package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character character;
    StringBuilder sb = new StringBuilder();

    public StringAssembler(Character delimeter) {
        this.character=delimeter;
    }

    public StringAssembler append(String str) {
        List<String> list=new ArrayList<>();

        String loopDelim = "";

        for(String s : list) {

            sb.append(loopDelim);
            sb.append(s);

            loopDelim = String.valueOf(character);
        }

       // return sb.toString();
        return null;
    }


    public String assemble() {
        String str="";

        char[] chars=str.toCharArray();
        StringBuilder sb = new StringBuilder(str);
        for(char string : chars) {
            sb.append(chars);
            sb.append(character);
        }
        String string =sb.toString();
        return string;
    }
}
