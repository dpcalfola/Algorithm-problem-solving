package leetcode2022Feb.l13_RomanToInteger;

class Solution_failed {
    public int romanToInt(String s) {

        int sum = 0;

        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == 'I') {
                sum += 1;
            } else if (c == 'V') {
                sum += 5;
            } else if (c == 'X') {
                sum += 10;
            } else if (c == 'L') {
                sum += 50;
            } else if (c == 'C') {
                sum += 100;
            } else if (c == 'D') {
                sum += 500;
            } else if (c == 'M') {
                sum += 1000;
            }
        }

        return sum ;
    }

    public static void main(String[] args) {

        Solution_failed s1 = new Solution_failed();

        System.out.println(s1.romanToInt("MCMXCIV"));


    }
}


/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/