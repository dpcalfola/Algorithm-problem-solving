package leetcode2022Feb.l9_PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);

        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        String palindrome = sb.toString();
        return str.equals(palindrome);

    }


    public static void main(String[] args) {
        Solution s1 = new Solution();

        System.out.println(s1.isPalindrome(-121));
    }
}