/*
 * [389] Find the Difference
 *
 * https://leetcode.com/problems/find-the-difference
 *
 * algorithms
 * Easy (50.78%)
 * Total Accepted:    82.2K
 * Total Submissions: 161.8K
 * Testcase Example:  '"abcd"\n"abcde"'
 *
 * 
 * Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input:
 * s = "abcd"
 * t = "abcde"
 * 
 * Output:
 * e
 * 
 * Explanation:
 * 'e' is the letter that was added.
 * 
 */
// a^b^a=b also works for char
/*
class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char c: s.toCharArray())    res^=c;
        for(char c: t.toCharArray())    res^=c;
        return res;
    }
}*/
// s: 'a'
// t: 'ae'
// -'a'+'a'+'e'=='e'
class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char c: s.toCharArray())    res-=c;
        for(char c: t.toCharArray())    res+=c;
        return res;
    }
}