package itis.example6;

public class A {

    static boolean isVowel(char c) {
        String values = "EYUIOAeyuioa";
        for (int i = 0; i < values.length(); i++) {
            if (values.charAt(i) == c) return  true;
        }
        return  false;
    }

    static boolean ok(String s) {
        s = "d" + s + "d";
        int count = 0;
        for (int i = 1; i < s.length() - 2; i++) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))
                    && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 2))) count++;
        }
        return count == 3;
    }

    public static void main(String[] args) {
        System.out.println(ok("aabbeeca"));
    }
}
