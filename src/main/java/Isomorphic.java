import java.util.Arrays;

public class Isomorphic implements IIsomorphic {

    static int size = 256;

    public boolean areIsomorphic(String str1, String str2) {

        /**
         * Input string should no be empty
         */
        if(str1 == null || str2 == null)
            return false;
        if(str1.length() == 0 || str2.length()==0)
            return false;
        int m = str1.length();
        int n = str2.length();

        /**
         * Length of both strings must be same
         */

        if (m != n)
            return false;

        /**
         * To mark visited characters in str2
         */
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        /**
         * To store mapping of every character from str1 to
         * that of str2. Initialize all entries of map as -1.
         */
        int[] map = new int[size];
        Arrays.fill(map, -1);

        /**
         * Process all characters one by one
         */
        for (int i = 0; i < n; i++) {
            /**
             * If current character of str1 is seen first time in it
             */
            if (map[str1.charAt(i)] == -1) {
                /**
                 * If current character of str2 is already
                 * seen, one to one mapping not possible
                 */
                if (marked[str2.charAt(i)] == true)
                    return false;
                /**
                 * Mark current character of str2 as visited
                 */
                marked[str2.charAt(i)] = true;
                /**
                 * Store mapping of current characters
                 */
                map[str1.charAt(i)] = str2.charAt(i);
            }
            /**
             * If this is not first appearance of current
             * character in str1, then check if previous
             * appearance mapped to same character of str2
             */
            else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }
        return true;
    }
}
