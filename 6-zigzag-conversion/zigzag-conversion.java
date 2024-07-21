class Solution {


    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int step1 = (numRows * 2) - 2;
            int step2 = i * 2;
            for (int j = i; j < s.length(); j += step1) {
                r.append(s.charAt(j));
                if (step2 > 0 && step2 < step1 && j + step1 - step2 < s.length()) {
                    r.append(s.charAt(j + step1 - step2));
                }
            }
        }
        return r.toString();
    }
}