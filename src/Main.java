import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static int vowelStrings(String[] words, int left, int right) {
        ArrayList<Character> aaa = new ArrayList<>(Arrays.asList('i','a','u','e','o'));
        int x = 0;
        /* aaa.add('i');
         aaa.add('a');
         aaa.add('u');
         aaa.add('e');
         aaa.add('o');*/
        for (int i = left; i < right+1; i++) {
            if (aaa.contains(words[i].charAt(0)) && aaa.contains(words[i].charAt(words[i].length()-1))){
                x++;
            }


        }
        return x;
    }
    public static void main(String[] args) {
        String[] words = new String[] {"are","amy","u"};
        System.out.println(vowelStrings(words,0,2));
    }
}