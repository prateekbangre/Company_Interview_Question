package company_interview_questions;

/**
 * @author prateek.bangre on 21/09/21.
 * @Project DataStructure_Algorithms
 */
//url: https://leetcode.com/discuss/interview-question/427484/mathworks
public class Visa_Question2 {

    public static int findSmallestDivisor(String s, String t) {
        if (s.length() < t.length()) return -1;

        int ans = t.length();
        String res = s.replaceAll(t, "");
        if (res.length() != 0) return -1;

        for (int i = t.length(); i >= 0; i--) {
            String sub = t.substring(0, i);
            String rep = s.replaceAll(sub, "");
            if (rep.length() == 0) {
                ans = Math.min(ans, sub.length());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestDivisor("bcdbcdbcdbcd","bcdbcd"));

    }

}
