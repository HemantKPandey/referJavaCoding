import java.util.Arrays;

public class StringMagic {

    public static void main(String[] args) {
        String str1;
        String str2;
        System.out.println(areAnagrams("Listens", "Silent"));
    }
    public static boolean areAnagrams(String str1, String str2){
        System.out.println(str1);
        System.out.println(str2);

        if(str1 == null|| str2==null||str1.length() != str2.length()) {
            return false;
        }

// string.toLowerCase() - Converts all of the characters in this String to lower case.

        String str1_l = str1.toLowerCase();
        String str2_l = str2.toLowerCase();

        System.out.println(str1_l);
        System.out.println(str2_l);
//string.toCharArray() - Converts this string to a new character array.
        char[] char1 = str1_l.toCharArray();
        char[] char2 = str2_l.toCharArray();

        System.out.println(char1);
        System.out.println(char2);

//Arrays.sort(charArray) - Sorts the specified array into ascending numerical order.
        Arrays.sort(char1);
        Arrays.sort(char2);

        System.out.println(char1);
        System.out.println(char2);
//Arrays.equals(charArray1, charArray2) - Returns true if the two specified arrays of chars are equal to one another.
        if(Arrays.equals(char1, char2)){
            return true;
        } else {
            return false;
        }
    }
}