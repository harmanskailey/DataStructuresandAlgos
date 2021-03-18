/*Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
Note: You may assume the string contains only lowercase English letters.
Examples:
s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
 */
public class firstUnqChar {

    public int firstUniqChar(String s){
        int freq[] = new int[256];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i) - 'a']++;
        for(int i=0;i<s.length();i++)
            if(freq[s.charAt(i)-'a']==1)
                return i;
        return -1;
    }
    
}
