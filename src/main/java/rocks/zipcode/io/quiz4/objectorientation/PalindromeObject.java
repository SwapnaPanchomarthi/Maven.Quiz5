package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private String string;

    public PalindromeObject(String input) {
        this.string=input;
    }

    public String[] getAllPalindromes(){

        return null;
    }

    public Boolean isPalindrome(){

        StringBuffer sb1 = new StringBuffer(string);
        StringBuffer sb2 = sb1.reverse();
        boolean flag = false;

        if(sb1.equals(sb2))
            flag=true;

        else flag=false;

        return flag;
    }

    public String reverseString(){
        StringBuffer sb1 = new StringBuffer(string);
        StringBuffer sb2 = sb1.reverse();
        return sb2.toString();
    }
}
