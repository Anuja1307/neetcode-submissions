class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i),
                    countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int need = countT.size();
        int have = 0;

        int l = 0;
        int resLen = Integer.MAX_VALUE;
        int[] res = {-1, -1};

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            countS.put(c, countS.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c)
                    && countS.get(c).equals(countT.get(c))) {
                have++;
            }

            while (have == need) {

                if (r - l + 1 < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char left = s.charAt(l);

                countS.put(left, countS.get(left) - 1);

                if (countT.containsKey(left)
                        && countS.get(left) < countT.get(left)) {
                    have--;
                }

                l++;
            }
        }

        if (resLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(res[0], res[1] + 1);
    }
}