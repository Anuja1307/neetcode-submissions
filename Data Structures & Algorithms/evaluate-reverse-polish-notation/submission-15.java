class Solution {
    public int evalRPN(String[] tokens) {
        List<String> arr = new ArrayList<>(Arrays.asList(tokens));
        int i = 0;
        while (arr.size() > 1) {

            int j = i;

            while (! "+-*/".contains(arr.get(j))) {
                j++;
            }

            int result;

            if (arr.get(j).equals("+")) {
                result = Integer.parseInt(arr.get(j - 2))
                        + Integer.parseInt(arr.get(j - 1));
            }

            else if (arr.get(j).equals("-")) {
                result = Integer.parseInt(arr.get(j - 2))
                        - Integer.parseInt(arr.get(j - 1));
            }

            else if (arr.get(j).equals("*")) {
                result = Integer.parseInt(arr.get(j - 2))
                        * Integer.parseInt(arr.get(j - 1));
            }

            else {
                result = Integer.parseInt(arr.get(j - 2))
                        / Integer.parseInt(arr.get(j - 1));
            }

           

            arr.remove(j - 1);
            arr.remove(j - 1);
             arr.set(j - 2, String.valueOf(result));
            i = 0;
        }

        return Integer.parseInt(arr.get(0));
    }
}