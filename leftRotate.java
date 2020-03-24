/**
 *
 * @author Hammad
 * Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g.
 * “MyString” rotated by 2 is “ngMyStri”.
 *
 */

public class leftRotate {
    /**
     * The solution that I have implemented to the above problem takes the last 2 characters and places it at the
     * beginning and shift every character from the beginning to the right.
     * @param str
     * @return
     */
    public static String rotate_inplace(char[] str) {
        if(str.length < 2) {
            return String.valueOf(str);
        }
        for(int i = 0; i < 2; i++) {
            char lastChar = str[str.length - 1];
            char next = str[0];
            for(int j=0; j < str.length - 1;j++) {
                char val = next;
                next = str[j + 1];
                str[j+1]=val;
            }
            str[0]=lastChar;
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        String str= "MyString";
        System.out.println(rotate_inplace(str.toCharArray()));;
        String str1 = "ng";
        System.out.println(rotate_inplace(str1.toCharArray()));;
        String str2 = "n";
        System.out.println(rotate_inplace(str2.toCharArray()));;

    }

}

