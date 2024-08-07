import java.util.Hashtable;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) return false;

        Hashtable<Character, String> hashtable = new Hashtable<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String word = arr[i];

            if (hashtable.containsKey(c1)) {
                if (!hashtable.get(c1).equals(word)) return false;
            } else {
                if (hashtable.containsValue(word)) return false;
                hashtable.put(c1, word);
            }
        }

        return true;
    }
}