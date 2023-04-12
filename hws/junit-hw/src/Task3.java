import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class Task3 {
    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;

        int length = str.length();
        int center = length / 2;

        for (int i = 0; i < center; i++) {
            if(str.charAt(i) != str.charAt(length - i - 1)) return false;
        }
        return true;
    }

    public long vowelsCount(String str) {
        return str.toLowerCase().chars().filter(ch -> ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u').count();
    }

    static final HashSet<Character> consonantLetters = new HashSet<>() {{
        add('w'); add('l'); add('y'); add('p'); add('k'); add('z'); add('x'); add('c');
        add('r'); add('s'); add('t'); add('b'); add('f'); add('n'); add('j'); add('v');
        add('d'); add('g'); add('q'); add('m'); add('h');
    }};

    public long consonantCount(String str) {
        return str.toLowerCase().chars().filter(c -> consonantLetters.contains((char) c)).count();
    }

    public long wordCount(String str, String word) {
        str = str.toLowerCase();
        word = word.toLowerCase();
        if(str.isEmpty() || word.isEmpty()) return 0;
        return str.split(word, -1).length-1;
    }


    @Test
    public void testPalindromeEmpty() {
        boolean res = isPalindrome("");
        System.out.println(res);
        assertTrue(res);
    }

    @Test
    public void testPalindromeNull() {
        boolean res = isPalindrome(null);
        System.out.println(res);
        assertTrue(res);
    }

    @Test
    public void testPalindromeOdd() {
        boolean res = isPalindrome("hmaeamh");
        System.out.println(res);
        assertTrue(res);
    }

    @Test
    public void testPalindromeEven() {
        boolean res = isPalindrome("hmaamh");
        System.out.println(res);
        assertTrue(res);
    }

    @Test
    public void testNotPalindrome() {
        boolean res = isPalindrome("hmaambph");
        System.out.println(res);
        assertFalse(res);
    }

    @Test
    public void testPalindrome1() {
        boolean res = isPalindrome("1");
        System.out.println(res);
        assertTrue(res);
    }

    @Test
    public void testVowels() {
        long res = vowelsCount("Number of vowels in the given sentence is");
        System.out.println(res);
        assertEquals(13, res);
    }

    @Test
    public void testConsonant() {
        long res = consonantCount("Number of vowels in the given sentence is");
        System.out.println(res);
        assertEquals(21, res);
    }

    @Test
    public void test1Word() {
        long res = wordCount("Number of vowels in the given sentence is", "number");
        System.out.println(res);
        assertEquals(1, res);
    }

    @Test
    public void test0Word() {
        long res = wordCount("Number of vowels in the given sentence is", "me");
        System.out.println(res);
        assertEquals(0, res);
    }

    @Test
    public void test5Word() {
        long res = wordCount("Number me me me me me of vowels in the given sentence is", "me");
        System.out.println(res);
        assertEquals(5, res);
    }

    @Test
    public void testEmptyWord() {
        long res = wordCount("Number me me me me me of vowels in the given sentence is", "");
        System.out.println(res);
        assertEquals(0, res);
    }
}
